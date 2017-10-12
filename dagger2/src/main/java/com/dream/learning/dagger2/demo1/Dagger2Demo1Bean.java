package com.dream.learning.dagger2.demo1;

import android.util.Log;

import javax.inject.Inject;

/**
 * Created by SuSong on 2017/10/10.
 */

public class Dagger2Demo1Bean {

    @Inject
    public Dagger2Demo1Bean() {

    }

    public void doSomething() {
        Log.d("XLog", "Dagger2Demo1Bean doSomething");
    }
}
