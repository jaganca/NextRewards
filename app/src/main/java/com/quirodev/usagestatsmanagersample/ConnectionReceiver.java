package com.quirodev.usagestatsmanagersample;

import android.app.IntentService;
import android.content.Intent;
import android.content.Context;
import android.net.ConnectivityManager;
import android.widget.Toast;
import android.content.BroadcastReceiver;
import android.net.NetworkInfo;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.AsyncTask;
import android.preference.PreferenceManager;
import android.renderscript.Element;
import android.widget.Toast;

import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.ArrayList;

/**
 * An {@link IntentService} subclass for handling asynchronous task requests in
 * a service on a separate handler thread.
 * <p>
 * TODO: Customize class - update intent actions, extra parameters and static
 * helper methods.
 */
public class ConnectionReceiver extends BroadcastReceiver {

    public static int TYPE_WIFI = 1;
    public static int TYPE_MOBILE = 2;
    public static int TYPE_NOT_CONNECTED = 0;
    @Override
    public void onReceive(final Context context, final Intent intent) {

        Boolean toCheck = ConnectionReceiver.getConnectivityStatusString(context);
        if(toCheck) {
            SharedPreferences sharedPrefs = PreferenceManager.getDefaultSharedPreferences(context);
            Gson gson = new Gson();
            if (sharedPrefs.contains("appUsage")) {
                String json = sharedPrefs.getString("appUsage", null);
                Type type = new TypeToken<ArrayList<AppUsageData>>() {
                }.getType();
                ArrayList<AppUsageData> arrayList = gson.fromJson(json, type);
                //add to db

            }
        }

    }


    private static int getConnectivityStatus(Context context) {
        ConnectivityManager cm = (ConnectivityManager) context
                .getSystemService(Context.CONNECTIVITY_SERVICE);

        NetworkInfo activeNetwork = cm.getActiveNetworkInfo();
        if (null != activeNetwork) {
            if(activeNetwork.getType() == ConnectivityManager.TYPE_WIFI)
                return TYPE_WIFI;

            if(activeNetwork.getType() == ConnectivityManager.TYPE_MOBILE)
                return TYPE_MOBILE;
        }
        return TYPE_NOT_CONNECTED;
    }

    private static Boolean getConnectivityStatusString(Context context) {
        int conn = ConnectionReceiver.getConnectivityStatus(context);
        Boolean status = false;
        if (conn == ConnectionReceiver.TYPE_WIFI) {
            status = true;
        } else if (conn == ConnectionReceiver.TYPE_MOBILE) {
            status = true;
        } else if (conn == ConnectionReceiver.TYPE_NOT_CONNECTED) {
            status = true;
        }
        return status;
    }
}