package com.quirodev.usagestatsmanagersample.login;

import com.nexteducation.nextresources.ApiClient;
import com.nexteducation.nextresources.api.DefaultApi;
import com.nexteducation.nextresources.model.LoginCustomResponse;
import com.nexteducation.nextresources.model.UserRegistrationFetchRequest;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by jaganc on 28/10/17.
 */
public class LoginModel {

    private LoginListener mLoginListener;

    public LoginModel(LoginListener loginListener) {
        mLoginListener = loginListener;
    }

    public void login(UserRegistrationFetchRequest userRegistrationFetchRequest) {

        ApiClient apiClient = new ApiClient();
        apiClient.getAdapterBuilder().baseUrl("http://octopus.nexterp.in/NextConfig-chanakya/NextConfig/");
        DefaultApi defaultApi = apiClient.createService(DefaultApi.class);
        Call<LoginCustomResponse> call = defaultApi.registerAuthenticity(userRegistrationFetchRequest);
        call.enqueue(new Callback<LoginCustomResponse>() {
            @Override
            public void onResponse(Call<LoginCustomResponse> call, Response<LoginCustomResponse> response) {
                if(response.isSuccessful()) {
                    mLoginListener.loginSuccess(response.body());
                }
            }

            @Override
            public void onFailure(Call<LoginCustomResponse> call, Throwable t) {
                mLoginListener.loginFailed();
            }
        });


    }
}
