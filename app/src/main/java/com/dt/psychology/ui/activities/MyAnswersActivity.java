package com.dt.psychology.ui.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.dt.psychology.R;
import com.dt.psychology.dagger2.components.ActivityComponent;

public class MyAnswersActivity extends BaseActivity {

    @Override
    protected void init() {

    }

    @Override
    protected void inject(ActivityComponent activityComponent) {
        activityComponent.inject(this);
    }

    @Override
    protected int getContentView() {
        return R.layout.activity_my_answers;
    }
}
