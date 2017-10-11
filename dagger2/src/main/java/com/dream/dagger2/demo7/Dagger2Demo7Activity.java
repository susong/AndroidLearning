package com.dream.dagger2.demo7;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import javax.inject.Inject;

/**
 * Created by SuSong on 2017/10/11.
 */

public class Dagger2Demo7Activity extends AppCompatActivity {

    @Inject Dagger2Demo7Bean mDagger2Demo7Bean;
    @Inject Dagger2Demo7Bean mDagger2Demo7Bean2;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // AndroidManifest 文件中必须设置对应的 application
        // android:name=".demo7.Dagger2Demo7Application"
        DaggerDagger2Demo7ActivityComponent.builder()
                                           .dagger2Demo7ApplicationComponent(((Dagger2Demo7Application) getApplication()).getDagger2Demo7ApplicationComponent())
//                                           .dagger2Demo7ActivityModule(new Dagger2Demo7ActivityModule())
                                           .build()
                                           .inject(this);


        Log.d("XLog", "" + mDagger2Demo7Bean);
        Log.d("XLog", "" + mDagger2Demo7Bean2);
    }
}
