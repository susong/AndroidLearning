package com.dream.dagger2.demo8;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import javax.inject.Inject;
import javax.inject.Named;

/**
 * Created by SuSong on 2017/10/11.
 */

public class Dagger2Demo8Activity extends AppCompatActivity {

    @Inject
    Dagger2Demo8Bean mDagger2Demo8Bean;

    @Named("boy")
    @Inject
    Dagger2Demo8Bean boy;

    @Named("girl")
    @Inject
    Dagger2Demo8Bean girl;

    @ForBoy
    @Inject
    Dagger2Demo8Bean forBoy;

    @ForGirl
    @Inject
    Dagger2Demo8Bean forGirl;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        DaggerDagger2Demo8Component.create().inject(this);

        Log.d("XLog", "" + mDagger2Demo8Bean);
        Log.d("XLog", "" + boy);
        Log.d("XLog", "" + girl);
        Log.d("XLog", "" + forBoy);
        Log.d("XLog", "" + forGirl);
    }
}
