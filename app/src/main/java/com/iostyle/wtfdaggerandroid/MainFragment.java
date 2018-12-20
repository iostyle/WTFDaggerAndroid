package com.iostyle.wtfdaggerandroid;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.iostyle.wtfdaggerandroid.presenter.PresenterMainFragment;
import com.iostyle.wtfdaggerandroid.view.ViewMainFragment;

import javax.inject.Inject;

import dagger.android.support.DaggerFragment;

public class MainFragment extends DaggerFragment implements ViewMainFragment {
    @Inject
    PresenterMainFragment mPresenter;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mPresenter.test();
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.layout_fragment, container, false);
    }

    @Override
    public void test() {
        Toast.makeText(getContext(), "Fragment Test", Toast.LENGTH_SHORT).show();
    }
}
