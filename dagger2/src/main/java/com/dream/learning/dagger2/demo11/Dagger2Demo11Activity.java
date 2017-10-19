package com.dream.learning.dagger2.demo11;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import javax.inject.Inject;

import dagger.Lazy;

/**
 * Author:      SuSong
 * Email:       751971697@qq.com
 * GitHub:      https://github.com/susong7519
 * Date:        2017/10/11 下午2:14
 * Description: AndroidLearning
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
