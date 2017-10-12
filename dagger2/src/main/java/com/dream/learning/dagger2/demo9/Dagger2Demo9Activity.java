package com.dream.learning.dagger2.demo9;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import javax.inject.Inject;

/**
 * Created by SuSong on 2017/10/11.
 */

public class Dagger2Demo9Activity extends AppCompatActivity {

    @Inject
    Dagger2Demo9ABean mDagger2Demo9ABean;

    @Inject
    Dagger2Demo9BBean mDagger2Demo9BBean;

    //无法编译通过，因为Dagger2Demo9AHideBean 在Dagger2Demo9Component 中没有显示的
//    @Inject
//    Dagger2Demo9AHideBean mDagger2Demo9AHideBean;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Dagger2Demo9Component dagger2Demo9Component = DaggerDagger2Demo9Component.builder()
                                                                                 .dagger2Demo9Module(new Dagger2Demo9Module())
                                                                                 .build();

        DaggerDagger2Demo9PresenterComponent.builder()
                                            .dagger2Demo9Component(dagger2Demo9Component)
                                            .dagger2Demo9PresenterModule(new Dagger2Demo9PresenterModule())
                                            .build()
                                            .inject(this);

        Log.d("XLog", "" + mDagger2Demo9ABean);
        Log.d("XLog", "" + mDagger2Demo9BBean);
    }
}
