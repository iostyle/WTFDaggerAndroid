package com.iostyle.wtfdaggerandroid;

import android.app.Application;
import android.content.Context;

import com.simple.spiderman.SpiderMan;

public class App extends Application {

    private static Context application;

    @Override
    public void onCreate() {
        super.onCreate();
        application = this;
        SpiderMan.init(this);
    }

    public static Context getApplication() {
        return application;
    }
}
