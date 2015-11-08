package com.mayo.mvp;

import android.app.Application;

import dagger.ObjectGraph;

/**
 * Created by mayo on 8/11/15.
 */
public class App extends Application {

    private ObjectGraph objectGraph;

    @Override
    public void onCreate() {
        super.onCreate();

        objectGraph = ObjectGraph.create();
    }

    public ObjectGraph createScopedGraph(Object... modules) {
        return objectGraph.plus(modules);
    }

}
