package com.mayo.mvp.login;

import com.mayo.mvp.login.model.ActLogin;
import com.mayo.mvp.login.presenter.PresenterLogin;
import com.mayo.mvp.login.view.ViewLogin;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by mayo on 8/11/15.
 */
@Module(complete = false,
        library = true,
        injects = {
                ActLogin.class,
        }
)
public class LoginModule {
    private final ViewLogin viewLogin;

    public LoginModule(ViewLogin viewLogin) {
        this.viewLogin = viewLogin;
    }

    @Provides
    @Singleton
    ViewLogin provideViewLogin() {
        return viewLogin;
    }

    @Provides
    @Singleton
    PresenterLogin providePresenterLogin(ViewLogin viewLogin) {
        return new PresenterLogin(viewLogin);
    }
}
