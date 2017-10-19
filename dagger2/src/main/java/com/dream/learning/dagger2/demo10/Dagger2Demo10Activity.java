package com.dream.learning.dagger2.demo10;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import javax.inject.Inject;

/**
 * Author:      SuSong
 * Email:       751971697@qq.com
 * GitHub:      https://github.com/susong7519
 * Date:        2017/10/11 下午2:14
 * Description: AndroidLearning
 */
public class Dagger2Demo10Activity extends AppCompatActivity {

    @Inject
    Dagger2Demo10ABean mDagger2Demo10ABean;

    @Inject
    Dagger2Demo10BBean mDagger2Demo10BBean;

    @Inject
    Dagger2Demo10AHideBean mDagger2Demo10AHideBean;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        DaggerDagger2Demo10Component.builder()
                                    .dagger2Demo10Module(new Dagger2Demo10Module())
                                    .build()
                                    .addSub(new Dagger2Demo10PresenterModule())
                                    .inject(this);


        Log.d("XLog", "" + mDagger2Demo10ABean);
        Log.d("XLog", "" + mDagger2Demo10BBean);
        Log.d("XLog", "" + mDagger2Demo10AHideBean);
    }
}
