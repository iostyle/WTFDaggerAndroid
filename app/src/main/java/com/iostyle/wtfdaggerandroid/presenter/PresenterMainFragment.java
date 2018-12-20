package com.iostyle.wtfdaggerandroid.presenter;

import com.iostyle.wtfdaggerandroid.view.ViewMainFragment;

import javax.inject.Inject;

public class PresenterMainFragment {

    private ViewMainFragment mView;

    @Inject
    public PresenterMainFragment(ViewMainFragment view) {
        this.mView = view;
    }

    public void test() {
        this.mView.test();
    }
}
