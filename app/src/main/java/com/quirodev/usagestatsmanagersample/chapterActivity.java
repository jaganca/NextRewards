package com.quirodev.usagestatsmanagersample;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.gson.Gson;
import com.nexteducation.nextresources.model.Chapter;
import com.nexteducation.nextresources.model.LoginCustomResponse;

import java.util.List;

public class chapterActivity extends AppCompatActivity{

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {

        Bundle getBundle = null;
        getBundle = this.getIntent().getExtras();
        String name = getBundle.getString("chapter");

        LoginCustomResponse loginCustomResponse = new Gson().fromJson(name,LoginCustomResponse.class);

        List<Chapter> chapterList = loginCustomResponse.getChapterList();

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chapter);
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recyclerview);
        recyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
        ChapterAdapter adapter = new ChapterAdapter(chapterList);
        recyclerView.setAdapter(adapter);

    }
}