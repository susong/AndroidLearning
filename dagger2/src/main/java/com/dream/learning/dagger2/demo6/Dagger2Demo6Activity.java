package com.dream.learning.dagger2.demo6;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import javax.inject.Inject;

/**
 * Created by SuSong on 2017/10/10.
 */

public class Dagger2Demo6Activity extends AppCompatActivity {

    @Inject Dagger2Demo6Bean mDagger2Demo6Bean;
    @Inject Dagger2Demo6Bean mDagger2Demo6BeanOther;

    @Inject Dagger2Demo6Bean2 mDagger2Demo6Bean2;
    @Inject Dagger2Demo6Bean2 mDagger2Demo6Bean2Other;

    @Inject Dagger2Demo6SingleBean mDagger2Demo6SingleBean;
    @Inject Dagger2Demo6SingleBean mDagger2Demo6SingleBeanOther;

    @Inject Dagger2Demo6SingleBean2 mDagger2Demo6SingleBean2;
    @Inject Dagger2Demo6SingleBean2 mDagger2Demo6SingleBean2Other;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        DaggerDagger2Demo6Component.create().inject(this);

        Log.d("XLog", "" + mDagger2Demo6Bean);
        Log.d("XLog", "" + mDagger2Demo6BeanOther);
        Log.d("XLog", "" + mDagger2Demo6Bean2);
        Log.d("XLog", "" + mDagger2Demo6Bean2Other);
        Log.d("XLog", "" + mDagger2Demo6SingleBean);
        Log.d("XLog", "" + mDagger2Demo6SingleBeanOther);
        Log.d("XLog", "" + mDagger2Demo6SingleBean2);
        Log.d("XLog", "" + mDagger2Demo6SingleBean2Other);

    }
}
