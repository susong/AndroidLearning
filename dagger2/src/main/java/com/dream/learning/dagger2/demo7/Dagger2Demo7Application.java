package com.dream.learning.dagger2.demo7;

import android.app.Application;

/**
 * Author:      SuSong
 * Email:       751971697@qq.com
 * GitHub:      https://github.com/susong7519
 * Date:        2017/10/11 下午2:14
 * Description: AndroidLearning
 */
public class Dagger2Demo7Application extends Application {

    private Dagger2Demo7ApplicationComponent mDagger2Demo7ApplicationComponent;

    @Override
    public void onCreate() {
        super.onCreate();

        mDagger2Demo7ApplicationComponent = DaggerDagger2Demo7ApplicationComponent.builder()
                                                                                  .dagger2Demo7ApplicationModule(new Dagger2Demo7ApplicationModule(this))
                                                                                  .build();
        mDagger2Demo7ApplicationComponent.inject(this);
    }

    public Dagger2Demo7ApplicationComponent getDagger2Demo7ApplicationComponent() {
        return mDagger2Demo7ApplicationComponent;
    }
}
