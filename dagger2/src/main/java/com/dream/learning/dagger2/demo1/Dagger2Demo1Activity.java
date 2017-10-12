package com.dream.learning.dagger2.demo1;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import javax.inject.Inject;

/**
 * Created by SuSong on 2017/10/10.
 */

public class Dagger2Demo1Activity extends AppCompatActivity {

    @Inject
    Dagger2Demo1Bean mDagger2Demo1Bean;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // DaggerInjectTestComponent 是自动生成的，必须先编译一下，AndroidStudio里是Make Project就好了。
        // /AndroidLearning/dagger2/build/generated/source/apt/debug/com/dream/dagger2/inject_test/DaggerInjectTestComponent.java
        DaggerDagger2Demo1Component.builder().build().inject(this);
        mDagger2Demo1Bean.doSomething();
    }
}
