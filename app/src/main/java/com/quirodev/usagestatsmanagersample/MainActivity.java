package com.quirodev.usagestatsmanagersample;

import android.app.*;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.provider.Settings;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import com.google.gson.Gson;
import com.nexteducation.nextresources.model.LoginCustomResponse;
import com.nexteducation.nextresources.model.UserRegistrationFetchRequest;
import com.quirodev.usagestatsmanagersample.login.LoginListener;
import com.quirodev.usagestatsmanagersample.login.LoginModel;

import org.json.JSONObject;

import java.util.Calendar;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

import static android.view.View.GONE;
import static android.view.View.VISIBLE;

public class MainActivity extends AppCompatActivity implements UsageContract.View, LoginListener {

    private ProgressBar progressBar;
    private TextView permissionMessage;

    private UsageContract.Presenter presenter;
    private UsageStatAdapter adapter;
    private LoginModel mLoginModel;
    Button b1,b2;
    EditText ed1,ed2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

                super.onCreate(savedInstanceState);
                setContentView(R.layout.login);

                b1 = (Button)findViewById(R.id.button);
                ed1 = (EditText)findViewById(R.id.editText);
                ed2 = (EditText)findViewById(R.id.editText2);

                b2 = (Button)findViewById(R.id.button2);


                b1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                            //make a call to fetch content and show
                            if(mLoginModel == null) {
                                mLoginModel = new LoginModel(MainActivity.this);
                            }
                        UserRegistrationFetchRequest userRegistrationFetchRequest = new UserRegistrationFetchRequest();
                        userRegistrationFetchRequest.setLoginType(UserRegistrationFetchRequest.LoginTypeEnum.STUDENT);
                        userRegistrationFetchRequest.setUserName(ed1.getText().toString());
                        userRegistrationFetchRequest.setPassword(ed2.getText().toString());
                        mLoginModel.login(userRegistrationFetchRequest);

                    }
                });

                b2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        finish();
                    }
                });
            }




    private void openSettings() {
        startActivity(new Intent(Settings.ACTION_USAGE_ACCESS_SETTINGS));
    }

    @Override
    protected void onResume() {
        super.onResume();
        //showProgressBar(true);
//        presenter = new UsagePresenter(this, this);
        //presenter.retrieveUsageStats();
    }

    @Override
    public void onUsageStatsRetrieved(List<UsageStatsWrapper> list) {
        showProgressBar(false);
        permissionMessage.setVisibility(GONE);
        adapter.setList(list);
    }

    @Override
    public void onUserHasNoPermission() {
        showProgressBar(false);
        permissionMessage.setVisibility(VISIBLE);
    }

    private void showProgressBar(boolean show) {
        if (show) {
            progressBar.setVisibility(VISIBLE);
        } else {
            progressBar.setVisibility(GONE);
        }
    }

    @Override
    public void loginSuccess(LoginCustomResponse loginCustomResponse) {
        Toast.makeText(this, "login Success", Toast.LENGTH_LONG).show();

        SharedPreferences sharedPrefs = PreferenceManager.getDefaultSharedPreferences(this);
        SharedPreferences.Editor editor = sharedPrefs.edit();

        editor.putLong("studentId", loginCustomResponse.getStudentId());
        editor.putLong("classId",loginCustomResponse.getClassId());
        editor.commit();

        Gson gson = new Gson();

        String json = gson.toJson(loginCustomResponse);

        Intent i=new Intent(MainActivity.this, chapterActivity.class);
        Bundle bundle = new Bundle();
        bundle.putSerializable("chapter", json);
        i.putExtras(bundle);
        startActivity(i);
    }

    @Override
    public void loginFailed() {
        Toast.makeText(this, "Login Failed", Toast.LENGTH_LONG).show();
    }
}
