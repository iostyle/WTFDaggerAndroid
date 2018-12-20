package com.iostyle.wtfdaggerandroid.presenter;

import com.iostyle.wtfdaggerandroid.view.ViewMainActivity;

import javax.inject.Inject;

public class PresenterMainActivity {

    private ViewMainActivity mView;

    @Inject
    public PresenterMainActivity(ViewMainActivity view) {
        this.mView = view;
    }

    public void test() {
        this.mView.test();
    }
}
