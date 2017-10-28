package com.quirodev.usagestatsmanagersample.Chapter;

import com.nexteducation.nextresources.model.ChapterResponse;
import com.nexteducation.nextresources.model.LoginCustomResponse;

/**
 * Created by jaganc on 28/10/17.
 */
public interface ChapterListener {
    void chapterSuccess(ChapterResponse chapterResponse);
    void chapterFailed();

}
