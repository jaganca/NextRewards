package com.quirodev.usagestatsmanagersample;
import android.app.IntentService;
import android.content.Intent;

public class AlarmService extends IntentService {
    public AlarmService() {
        super("MService");
    }
    private UsageStatAdapter adapter;
    private UsageContract.Presenter presenter;
    @Override
    protected void onHandleIntent(Intent intent) {
        // Your firebase task
        presenter.retrieveUsageStats();

    }
}