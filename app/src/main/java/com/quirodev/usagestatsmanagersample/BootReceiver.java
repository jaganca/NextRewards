package com.quirodev.usagestatsmanagersample;

import android.app.IntentService;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

import java.util.Calendar;


/**
 * An {@link IntentService} subclass for handling asynchronous task requests in
 * a service on a separate handler thread.
 * <p>
 * TODO: Customize class - update intent actions and extra parameters.
 */
public class BootReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(final Context context, final Intent intent) {

        Calendar calendar = Calendar.getInstance();
//
        calendar.set(Calendar.HOUR_OF_DAY, 23);
        calendar.set(Calendar.MINUTE, 0);
        calendar.set(Calendar.SECOND, 0);

        final PendingIntent pIntent = PendingIntent.getBroadcast(context,0,intent, PendingIntent.FLAG_UPDATE_CURRENT);
        long firstMillis = calendar.getTimeInMillis();
        android.app.AlarmManager alarm = (android.app.AlarmManager) context.getSystemService(Context.ALARM_SERVICE);
        alarm.set(android.app.AlarmManager.RTC_WAKEUP, firstMillis, pIntent);
    }
}
