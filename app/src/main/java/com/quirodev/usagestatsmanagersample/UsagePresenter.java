package com.quirodev.usagestatsmanagersample;

import android.app.AlarmManager;
import android.app.AppOpsManager;
import android.app.IntentService;
import android.app.PendingIntent;
import android.app.usage.UsageStats;
import android.app.usage.UsageStatsManager;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.AsyncTask;
import android.preference.PreferenceManager;
import android.renderscript.Element;
import android.widget.Toast;
import android.net.ConnectivityManager;
import android.widget.Toast;
import android.content.BroadcastReceiver;
import android.net.NetworkInfo;

import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import org.jsoup.Jsoup;
import org.jsoup.helper.HttpConnection;
import org.w3c.dom.Document;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.TimeZone;
import java.util.Timer;
import java.util.TimerTask;

import static android.app.AppOpsManager.MODE_ALLOWED;
import static android.app.AppOpsManager.OPSTR_GET_USAGE_STATS;
import static android.os.Process.myUid;



public class UsagePresenter implements UsageContract.Presenter{
    public final static String GOOGLE_URL = "https://data.42matters.com/api/v2.0/android/apps/lookup.json?p=";
    public final static String acesssToken ="&access_token=6af80ec518c4d10306aa16f9fb858e31d31b73bb";
   public static final String ERROR = "error";

    private static final int flags = PackageManager.GET_META_DATA |
            PackageManager.GET_SHARED_LIBRARY_FILES |
            PackageManager.GET_UNINSTALLED_PACKAGES;

    private UsageStatsManager usageStatsManager;
    private PackageManager packageManager;
    private UsageContract.View view;
    private final Context context;

    public UsagePresenter(Context context, UsageContract.View view) {
        usageStatsManager = (UsageStatsManager) context.getSystemService("usagestats");
        packageManager = context.getPackageManager();
        this.view = view;
        this.context = context;
    }

    private long getStartTime() {
        Calendar calendar = Calendar.getInstance(TimeZone.getTimeZone("IST"));
        calendar.set(Calendar.HOUR_OF_DAY, 0);// for 0 hour
        calendar.set(Calendar.MINUTE, 0);// for 0 min
        calendar.set(Calendar.SECOND, 0);
//        calendar.add(Calendar.YEAR, -1);
        return calendar.getTimeInMillis();
    }

    private long getEndTime() {
        Calendar calendar = Calendar.getInstance(TimeZone.getTimeZone("IST"));
        calendar.set(Calendar.HOUR_OF_DAY, 23);// for 0 hour
        calendar.set(Calendar.MINUTE, 59);// for 0 min
        calendar.set(Calendar.SECOND, 59);
//        calendar.add(Calendar.YEAR, -1);
        return calendar.getTimeInMillis();
    }

    private boolean isNetworkAvailable(Context context) {
        ConnectivityManager connectivityManager
                = (ConnectivityManager)context.getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    @Override
    public void retrieveUsageStats() {
        if (!checkForPermission(context)) {
            view.onUserHasNoPermission();
            return;
        }

        String query_url;
        List<String> installedApps = getInstalledAppList();
        List <UsageStats> usageStats = usageStatsManager.queryUsageStats(0,getStartTime(), getEndTime());
        List<UsageStats> stats = new ArrayList<>();
        stats.addAll(usageStats);


        long date = System.currentTimeMillis();
        List<AppUsageData> appUsageList = new ArrayList<>();
        for(int i=0;i<usageStats.size();i++){
            AppUsageData usage = new AppUsageData();
            usage.setName(usageStats.get(i).getPackageName());
            usage.setMinutes((int) ((usageStats.get(i).getTotalTimeInForeground()/(1000*60)) % 60));
            usage.setDate(date);
           appUsageList.add(usage);
        }
        if(this.isNetworkAvailable(context)){
            //make a call to save at that time itself
        }else {
            SharedPreferences sharedPrefs = PreferenceManager.getDefaultSharedPreferences(context);
            SharedPreferences.Editor editor = sharedPrefs.edit();
            Gson gson = new Gson();

            String json = gson.toJson(appUsageList);

            editor.putString("appUsage", json);
            editor.commit();
        }

        List<UsageStatsWrapper> finalList = buildUsageStatsWrapper(installedApps, stats);
        view.onUsageStatsRetrieved(finalList);
    }

    private boolean checkForPermission(Context context) {
        AppOpsManager appOps = (AppOpsManager) context.getSystemService(Context.APP_OPS_SERVICE);
        int mode = appOps.checkOpNoThrow(OPSTR_GET_USAGE_STATS, myUid(), context.getPackageName());
        return mode == MODE_ALLOWED;
    }

    private List<String> getInstalledAppList(){
        List<ApplicationInfo> infos = packageManager.getInstalledApplications(flags);
        List<String> installedApps = new ArrayList<>();
        for (ApplicationInfo info : infos){
            installedApps.add(info.packageName);
        }
        return installedApps;
    }

    private List<UsageStatsWrapper> buildUsageStatsWrapper(List<String> packageNames, List<UsageStats> usageStatses) {
        List<UsageStatsWrapper> list = new ArrayList<>();
        for (String name : packageNames) {
            boolean added = false;
            for (UsageStats stat : usageStatses) {
                if (name.equals(stat.getPackageName())) {
                    added = true;
                    list.add(fromUsageStat(stat));
                }
            }
            if (!added) {
                list.add(fromUsageStat(name));
            }
        }
        Collections.sort(list);
        return list;
    }

    private UsageStatsWrapper fromUsageStat(String packageName) throws IllegalArgumentException {
        try {
            ApplicationInfo ai = packageManager.getApplicationInfo(packageName, 0);
            return new UsageStatsWrapper(null, packageManager.getApplicationIcon(ai), packageManager.getApplicationLabel(ai).toString());

        } catch (PackageManager.NameNotFoundException e) {
            throw new IllegalArgumentException(e);
        }
    }

    private UsageStatsWrapper fromUsageStat(UsageStats usageStats) throws IllegalArgumentException {
        try {
            ApplicationInfo ai = packageManager.getApplicationInfo(usageStats.getPackageName(), 0);
            return new UsageStatsWrapper(usageStats, packageManager.getApplicationIcon(ai), packageManager.getApplicationLabel(ai).toString());

        } catch (PackageManager.NameNotFoundException e) {
            throw new IllegalArgumentException(e);
        }
    }
}
