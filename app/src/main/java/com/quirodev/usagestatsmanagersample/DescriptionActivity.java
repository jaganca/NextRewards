package com.quirodev.usagestatsmanagersample;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.TextView;

import com.google.gson.Gson;
import com.nexteducation.nextresources.model.Chapter;
import com.nexteducation.nextresources.model.ChapterResponse;
import com.nexteducation.nextresources.model.LoginCustomResponse;

import java.util.List;

/**
 * Created by jaganc on 28/10/17.
 */
public class DescriptionActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Bundle getBundle = null;
        getBundle = this.getIntent().getExtras();
        String chapter = getBundle.getString("text");
        setContentView(R.layout.description);
        TextView descriptionText = (TextView)findViewById(R.id.descriptionText);
        Button b1;

        ChapterResponse chapterResponse = new Gson().fromJson(chapter,ChapterResponse.class);

        String description = chapterResponse.getDescription();
        String chapterName = chapterResponse.getChapterName();
        descriptionText.setText(description);

    }
}
