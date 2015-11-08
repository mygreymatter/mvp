package com.mayo.mvp.login.presenter;

import com.mayo.mvp.login.view.ViewLogin;

/**
 * Created by mayo on 8/11/15.
 */
public class PresenterLogin {
    private final ViewLogin viewLogin;

    public PresenterLogin(ViewLogin view) {
        viewLogin = view;
    }

    public void validateCredentials(String username, String password) {
        if (!username.isEmpty() && !password.isEmpty()) {
            viewLogin.showSuccess("Login Successfull");
        } else {
            viewLogin.showFailure("Login Failure");
        }
    }
}
