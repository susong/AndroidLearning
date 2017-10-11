package com.dream.dagger2.demo7;

import android.app.Application;

/**
 * Created by SuSong on 2017/10/11.
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
