package com.iostyle.wtfdaggerandroid.dagger;

import com.iostyle.wtfdaggerandroid.MainActivity;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

// 注意这里用的是抽象类和抽象方法
@Module
abstract class BindModule {
    @ContributesAndroidInjector(modules = MainModule.class)
    abstract MainActivity mainActivity();  // 绑定MainActivity
}