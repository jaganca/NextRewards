package com.quirodev.usagestatsmanagersample.Chapter;

import com.nexteducation.nextresources.ApiClient;
import com.nexteducation.nextresources.api.DefaultApi;
import com.nexteducation.nextresources.model.ChapterResponse;
import com.nexteducation.nextresources.model.LoginCustomResponse;
import com.nexteducation.nextresources.model.UserRegistrationFetchRequest;
import com.quirodev.usagestatsmanagersample.login.LoginListener;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.http.Header;

/**
 * Created by jaganc on 28/10/17.
 */
public class ChapterModel {
    private ChapterListener mChapterListener;

    public ChapterModel(ChapterListener chapterListener) {
        mChapterListener = chapterListener;
    }

    public void chapter(Long subjectId, Long classId, Long chapterId, Long studentId) {

        ApiClient apiClient = new ApiClient();
        apiClient.getAdapterBuilder().baseUrl("http://192.168.33.202:8234/NextConfig-chanakya/NextConfig/");
        DefaultApi defaultApi = apiClient.createService(DefaultApi.class);
        Call<ChapterResponse> call = defaultApi.fetchChapters(subjectId, classId, chapterId, studentId);
        call.enqueue(new Callback<ChapterResponse>() {
            @Override
            public void onResponse(Call<ChapterResponse> call, Response<ChapterResponse> response) {
                if(response.isSuccessful()) {
                    mChapterListener.chapterSuccess(response.body());
                }
            }

            @Override
            public void onFailure(Call<ChapterResponse> call, Throwable t) {
                mChapterListener.chapterFailed();
            }
        });


    }
}
