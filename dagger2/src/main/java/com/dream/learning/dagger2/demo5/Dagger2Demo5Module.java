package com.dream.learning.dagger2.demo5;

import android.content.Context;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by SuSong on 2017/10/10.
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
