package com.dream.learning.dagger2.demo4;

import android.location.LocationManager;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import javax.inject.Inject;

/**
 * Author:      SuSong
 * Email:       751971697@qq.com
 * GitHub:      https://github.com/susong7519
 * Date:        2017/10/10 下午2:14
 * Description: AndroidLearning
 */
public class Dagger2Demo4Activity extends AppCompatActivity {

    @Inject LocationManager mLocationManager;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // AndroidManifest 文件中必须设置对应的 application
        // android:name=".demo4.Dagger2Demo4Application"
        ((Dagger2Demo4Application) getApplication()).getDagger2Demo4Component().inject(this);

        if (mLocationManager != null) {
            Log.d("XLog", "Dagger2Demo4Activity mLocationManager != null " + mLocationManager);
        } else {
            Log.d("XLog", "Dagger2Demo4Activity mLocationManager == null");
        }
    }
}
