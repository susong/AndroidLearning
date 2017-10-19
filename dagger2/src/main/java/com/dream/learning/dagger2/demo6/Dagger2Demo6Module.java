package com.dream.learning.dagger2.demo6;

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
public class Dagger2Demo6Module {

    @Provides
    Dagger2Demo6Bean2 provideDagger2Demo6Bean2() {
        return new Dagger2Demo6Bean2();
    }

    @Singleton
    @Provides
    Dagger2Demo6SingleBean2 provideDagger2Demo6SingleBean2() {
        return new Dagger2Demo6SingleBean2();
    }
}
