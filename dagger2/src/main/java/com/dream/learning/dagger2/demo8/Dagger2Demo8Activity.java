package com.dream.learning.dagger2.demo8;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import javax.inject.Inject;
import javax.inject.Named;

/**
 * Author:      SuSong
 * Email:       751971697@qq.com
 * GitHub:      https://github.com/susong7519
 * Date:        2017/10/11 下午2:14
 * Description: AndroidLearning
 */
public class Dagger2Demo8Activity extends AppCompatActivity {

    @Inject
    Dagger2Demo8Bean mDagger2Demo8Bean;

    @Named("boy")
    @Inject
    Dagger2Demo8Bean boy;

    @Named("girl")
    @Inject
    Dagger2Demo8Bean girl;

    @ForBoy
    @Inject
    Dagger2Demo8Bean forBoy;

    @ForGirl
    @Inject
    Dagger2Demo8Bean forGirl;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        DaggerDagger2Demo8Component.create().inject(this);

        Log.d("XLog", "" + mDagger2Demo8Bean);
        Log.d("XLog", "" + boy);
        Log.d("XLog", "" + girl);
        Log.d("XLog", "" + forBoy);
        Log.d("XLog", "" + forGirl);
    }
}
