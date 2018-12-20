package com.iostyle.wtfdaggerandroid.dagger;

import com.iostyle.wtfdaggerandroid.MainFragment;
import com.iostyle.wtfdaggerandroid.view.ViewMainFragment;

import dagger.Binds;
import dagger.Module;

@Module
abstract class MainFragmentModule {
    @Binds
    abstract ViewMainFragment bindView(MainFragment fragment);
}
