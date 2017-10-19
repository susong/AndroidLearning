package com.dream.learning.dagger2.demo3;

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
public class Dagger2Demo3Module {

    private final Dagger2Demo3Application mDagger2Demo3Application;

    public Dagger2Demo3Module(Dagger2Demo3Application dagger2Demo3Application) {
        mDagger2Demo3Application = dagger2Demo3Application;
    }

    @Singleton
    @Provides
    Dagger2Demo3Application provideDagger2Demo3Application() {
        return mDagger2Demo3Application;
    }

}
