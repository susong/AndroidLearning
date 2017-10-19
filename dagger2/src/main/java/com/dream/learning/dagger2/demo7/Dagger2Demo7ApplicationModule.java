package com.dream.learning.dagger2.demo7;

import android.content.Context;
import android.location.LocationManager;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Author:      SuSong
 * Email:       751971697@qq.com
 * GitHub:      https://github.com/susong7519
 * Date:        2017/10/11 下午2:14
 * Description: AndroidLearning
 */
@Module
public class Dagger2Demo7ApplicationModule {
    private final Dagger2Demo7Application mDagger2Demo7Application;

    public Dagger2Demo7ApplicationModule(Dagger2Demo7Application dagger2Demo7Application) {
        mDagger2Demo7Application = dagger2Demo7Application;
    }

    @Singleton
    @Provides
    Context getApplicationContext() {
        return mDagger2Demo7Application;
    }

    @Singleton
    @Provides
    LocationManager provideLocationManager() {
        return (LocationManager) mDagger2Demo7Application.getSystemService(Context.LOCATION_SERVICE);
    }

}
