package com.iostyle.wtfdaggerandroid;

import android.os.Bundle;
import android.widget.Toast;

import com.iostyle.wtfdaggerandroid.presenter.PresenterMainActivity;
import com.iostyle.wtfdaggerandroid.view.ViewMainActivity;

import javax.inject.Inject;

import dagger.android.support.DaggerAppCompatActivity;

public class MainActivity extends DaggerAppCompatActivity implements ViewMainActivity {
    @Inject
    PresenterMainActivity mPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mPresenter.test();
        getSupportFragmentManager().beginTransaction().replace(R.id.lay, new MainFragment()).commit();
    }

    @Override
    public void test() {
        Toast.makeText(this, "TEST", Toast.LENGTH_SHORT).show();
    }
}
