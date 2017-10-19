package com.dream.learning.dagger2.demo1;

import android.util.Log;

import javax.inject.Inject;

/**
 * Author:      SuSong
 * Email:       751971697@qq.com
 * GitHub:      https://github.com/susong7519
 * Date:        2017/10/10 下午2:14
 * Description: AndroidLearning
 */
public class Dagger2Demo1Bean {

    @Inject
    public Dagger2Demo1Bean() {

    }

    public void doSomething() {
        Log.d("XLog", "Dagger2Demo1Bean doSomething");
    }
}
