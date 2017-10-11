package com.dream.dagger2.demo11;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import javax.inject.Inject;

import dagger.Lazy;

/**
 * Created by SuSong on 2017/10/11.
 */

public class Dagger2Demo11Activity extends AppCompatActivity {

    @Inject Lazy<Dagger2Demo11Bean> mDagger2Demo11BeanLazy;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        DaggerDagger2Demo11Component.builder().build().inject(this);

        Log.d("XLog", "" + mDagger2Demo11BeanLazy.get());
    }
}
