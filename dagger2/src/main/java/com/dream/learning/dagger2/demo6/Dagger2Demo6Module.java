package com.dream.learning.dagger2.demo6;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by SuSong on 2017/10/10.
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
