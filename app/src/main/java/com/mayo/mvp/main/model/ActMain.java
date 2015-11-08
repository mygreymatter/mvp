package com.mayo.mvp.main.model;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

import com.mayo.mvp.R;
import com.mayo.mvp.base.ActBase;
import com.mayo.mvp.main.MainModule;
import com.mayo.mvp.main.presenter.PresenterMain;
import com.mayo.mvp.main.view.ViewMain;

import java.util.Arrays;
import java.util.List;

import javax.inject.Inject;

public class ActMain extends ActBase implements ViewMain {

    @Inject
    PresenterMain presenterMain;

    public static void intent(Context context) {
        Intent intent = new Intent(context, ActMain.class);
        context.startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.a_main);

    }

    @Override
    protected void onResume() {
        super.onResume();

        presenterMain.trigger();
    }

    @Override
    protected List<Object> getModules() {
        return Arrays.<Object>asList(new MainModule(this));
    }

    @Override
    public void showToast() {
        Toast.makeText(this, "Hello, World!", Toast.LENGTH_SHORT).show();
    }
}
