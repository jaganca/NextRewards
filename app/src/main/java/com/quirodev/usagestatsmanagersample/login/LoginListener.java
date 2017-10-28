package com.quirodev.usagestatsmanagersample.login;

import com.nexteducation.nextresources.model.LoginCustomResponse;

/**
 * Created by jaganc on 28/10/17.
 */
public interface LoginListener {

    void loginSuccess(LoginCustomResponse loginCustomResponse);
    void loginFailed();
}
