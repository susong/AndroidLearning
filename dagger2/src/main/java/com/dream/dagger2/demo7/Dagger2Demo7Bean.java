package com.dream.dagger2.demo7;

import android.location.LocationManager;

/**
 * Created by SuSong on 2017/10/11.
 */

public class Dagger2Demo7Bean {

    private LocationManager mLocationManager;

    public Dagger2Demo7Bean(LocationManager locationManager) {
        mLocationManager = locationManager;
    }
}
