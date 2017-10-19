package com.dream.learning.dagger2.demo7;

import android.location.LocationManager;

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
public class Dagger2Demo7ActivityModule {
    @Dagger2Demo7PerActivity
    @Provides
    Dagger2Demo7Bean provideDagger2Demo7Bean(LocationManager locationManager) {
        return new Dagger2Demo7Bean(locationManager);
    }
}
