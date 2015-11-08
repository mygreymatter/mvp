package com.mayo.mvp.main;

import com.mayo.mvp.main.model.ActMain;
import com.mayo.mvp.main.presenter.PresenterMain;
import com.mayo.mvp.main.view.ViewMain;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by mayo on 8/11/15.
 */
@Module(complete = false,
        library = true,
        injects = {
                ActMain.class,
        })
public class MainModule {
    private ViewMain viewMain;

    public MainModule(ViewMain viewMain) {
        this.viewMain = viewMain;
    }

    @Provides
    @Singleton
    ViewMain provideViewMain() {
        return viewMain;
    }

    @Provides
    @Singleton
    PresenterMain providePresenterMain(ViewMain viewMain) {
        return new PresenterMain(viewMain);
    }
}
