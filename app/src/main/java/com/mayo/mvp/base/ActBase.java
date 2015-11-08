package com.mayo.mvp.base;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.mayo.mvp.App;

import java.util.List;

import butterknife.ButterKnife;
import dagger.ObjectGraph;

public abstract class ActBase extends AppCompatActivity {

    private ObjectGraph objectGraph;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        objectGraph = ((App) getApplication()).createScopedGraph(getModules().toArray());
        objectGraph.inject(this);

    }

    @Override
    public void setContentView(int layoutResID) {
        super.setContentView(layoutResID);
        ButterKnife.bind(this);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        objectGraph = null;
        ButterKnife.unbind(this);
    }

    protected abstract List<Object> getModules();
}
