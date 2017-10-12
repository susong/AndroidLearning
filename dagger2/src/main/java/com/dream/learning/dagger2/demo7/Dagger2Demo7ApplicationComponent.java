package com.dream.learning.dagger2.demo7;

import android.location.LocationManager;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by SuSong on 2017/10/11.
 */
@Singleton
@Component(modules = Dagger2Demo7ApplicationModule.class)
public interface Dagger2Demo7ApplicationComponent {
    void inject(Dagger2Demo7Application dagger2Demo7Application);

    LocationManager getLocationManager();
}
