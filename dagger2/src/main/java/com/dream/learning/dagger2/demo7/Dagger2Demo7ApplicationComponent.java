package com.dream.learning.dagger2.demo7;

import android.location.LocationManager;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Author:      SuSong
 * Email:       751971697@qq.com
 * GitHub:      https://github.com/susong7519
 * Date:        2017/10/11 下午2:14
 * Description: AndroidLearning
 */
@Singleton
@Component(modules = Dagger2Demo7ApplicationModule.class)
public interface Dagger2Demo7ApplicationComponent {
    void inject(Dagger2Demo7Application dagger2Demo7Application);

    LocationManager getLocationManager();
}
