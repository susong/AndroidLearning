package com.dream.dagger2.demo5;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import javax.inject.Inject;

/**
 * Created by SuSong on 2017/10/10.
 */

public class Dagger2Demo5Activity extends AppCompatActivity {

    @Inject
    Dagger2Demo5Bean mDagger2Demo5Bean;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // AndroidManifest 文件中必须设置对应的 application
        // android:name=".demo5.Dagger2Demo5Application"

        DaggerDagger2Demo5Component.builder()
                                   .dagger2Demo5Module(new Dagger2Demo5Module((Dagger2Demo5Application) getApplication()))
                                   .build()
                                   .inject(this);


        if (mDagger2Demo5Bean != null) {
            Log.d("XLog", "Dagger2Demo5Activity mDagger2Demo5Bean != null " + mDagger2Demo5Bean);
        } else {
            Log.d("XLog", "Dagger2Demo5Activity mDagger2Demo5Bean == null");
        }
    }
}
