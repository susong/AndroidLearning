package com.dream.learning.dagger2.demo7;

import android.location.LocationManager;

import dagger.Module;
import dagger.Provides;

/**
 * Created by SuSong on 2017/10/11.
 */
@Module
public class Dagger2Demo7ActivityModule {
    @Dagger2Demo7PerActivity
    @Provides
    Dagger2Demo7Bean provideDagger2Demo7Bean(LocationManager locationManager) {
        return new Dagger2Demo7Bean(locationManager);
    }
}
