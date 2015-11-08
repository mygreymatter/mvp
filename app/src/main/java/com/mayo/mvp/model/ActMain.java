package com.mayo.mvp.model;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

import com.mayo.mvp.R;
import com.mayo.mvp.presenter.PresenterMain;
import com.mayo.mvp.view.ViewMain;

public class ActMain extends AppCompatActivity implements ViewMain{

    PresenterMain mPresenterMain;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.a_main);

        mPresenterMain = new PresenterMain(this);
        mPresenterMain.say();
    }

    @Override
    public void say() {
        Toast.makeText(this,"Hello, World!",Toast.LENGTH_SHORT).show();
    }
}
