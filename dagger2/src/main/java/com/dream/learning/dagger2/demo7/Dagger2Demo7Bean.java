package com.dream.learning.dagger2.demo7;

import android.location.LocationManager;

/**
 * Author:      SuSong
 * Email:       751971697@qq.com
 * GitHub:      https://github.com/susong7519
 * Date:        2017/10/11 下午2:14
 * Description: AndroidLearning
 */
public class Dagger2Demo7Bean {

    private LocationManager mLocationManager;

    public Dagger2Demo7Bean(LocationManager locationManager) {
        mLocationManager = locationManager;
    }
}
