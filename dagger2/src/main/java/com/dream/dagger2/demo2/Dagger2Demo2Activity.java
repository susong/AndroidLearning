package com.dream.dagger2.demo2;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import javax.inject.Inject;

/**
 * Created by SuSong on 2017/10/10.
 */

public class Dagger2Demo2Activity extends AppCompatActivity {

    @Inject
    Dagger2Demo2Bean mDagger2Demo2Bean;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        DaggerDagger2Demo2Component.builder().build().inject(this);

        mDagger2Demo2Bean.doSomething();
    }
}
