package com.iostyle.wtfdaggerandroid.dagger;

import com.iostyle.wtfdaggerandroid.MainActivity;
import com.iostyle.wtfdaggerandroid.view.ViewMainActivity;

import dagger.Binds;
import dagger.Module;

@Module
abstract class MainModule {
    @Binds
    abstract ViewMainActivity bindView(MainActivity act);
}
