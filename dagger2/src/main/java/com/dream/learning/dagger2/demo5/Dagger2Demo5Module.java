package com.dream.learning.dagger2.demo5;

import android.content.Context;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Author:      SuSong
 * Email:       751971697@qq.com
 * GitHub:      https://github.com/susong7519
 * Date:        2017/10/10 下午2:14
 * Description: AndroidLearning
 */
@Module
public class Dagger2Demo5Module {

    private final Dagger2Demo5Application mDagger2Demo5Application;

    public Dagger2Demo5Module(Dagger2Demo5Application dagger2Demo5Application) {
        mDagger2Demo5Application = dagger2Demo5Application;
    }

    @Singleton
    @Provides
    Context provideContext() {
        return mDagger2Demo5Application;
    }
}
