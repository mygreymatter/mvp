package com.mayo.mvp.presenter;

import com.mayo.mvp.view.ViewMain;

/**
 * Created by mayo on 8/11/15.
 */
public class PresenterMain {
    private final ViewMain viewMain;

    public PresenterMain(ViewMain viewMain){
        this.viewMain = viewMain;
    }

    public void say(){
        viewMain.say();
    }
}
