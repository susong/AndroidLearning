package com.dream.learning.dagger2.demo4;

import android.content.Context;
import android.location.LocationManager;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by SuSong on 2017/10/10.
 */

@Module
public class Dagger2Demo4Module {

    private final Dagger2Demo4Application mDagger2Demo4Application;

    public Dagger2Demo4Module(Dagger2Demo4Application dagger2Demo4Application) {
        mDagger2Demo4Application = dagger2Demo4Application;
    }

    @Singleton
    @Provides
    LocationManager provideLocationManager() {
        return (LocationManager) mDagger2Demo4Application.getSystemService(Context.LOCATION_SERVICE);
    }
}
