package com.iostyle.wtfdaggerandroid.dagger;

import com.iostyle.wtfdaggerandroid.App;

import dagger.Component;
import dagger.android.AndroidInjectionModule;
import dagger.android.AndroidInjector;
import dagger.android.support.AndroidSupportInjectionModule;

@Component(modules = {
        BindModule.class,
        AndroidSupportInjectionModule.class,  // 用于绑定扩展的组件，如v4
        AndroidInjectionModule.class // 用于绑定普通的组件
})
interface AppComponent  extends AndroidInjector<App> {
}
