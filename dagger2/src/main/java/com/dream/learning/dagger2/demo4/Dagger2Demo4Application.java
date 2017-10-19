package com.dream.learning.dagger2.demo4;

import android.app.Application;
import android.location.LocationManager;
import android.util.Log;

import javax.inject.Inject;

/**
 * Author:      SuSong
 * Email:       751971697@qq.com
 * GitHub:      https://github.com/susong7519
 * Date:        2017/10/10 下午2:14
 * Description: AndroidLearning
 */
public class Dagger2Demo4Application extends Application {

    @Inject LocationManager       mLocationManager;
    private Dagger2Demo4Component mDagger2Demo4Component;


    @Override
    public void onCreate() {
        super.onCreate();
        mDagger2Demo4Component = DaggerDagger2Demo4Component.builder()
                                                            .dagger2Demo4Module(new Dagger2Demo4Module(this))
                                                            .build();
        mDagger2Demo4Component.inject(this);

        if (mLocationManager != null) {
            Log.d("XLog", "Dagger2Demo4Application mLocationManager != null " + mLocationManager);
        } else {
            Log.d("XLog", "Dagger2Demo4Application mLocationManager == null");
        }
    }

    public Dagger2Demo4Component getDagger2Demo4Component() {
        return mDagger2Demo4Component;
    }
}
