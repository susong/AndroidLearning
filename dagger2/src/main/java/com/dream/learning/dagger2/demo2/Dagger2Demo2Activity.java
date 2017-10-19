package com.dream.learning.dagger2.demo2;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import javax.inject.Inject;

/**
 * Author:      SuSong
 * Email:       751971697@qq.com
 * GitHub:      https://github.com/susong7519
 * Date:        2017/10/10 下午2:14
 * Description: AndroidLearning
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
