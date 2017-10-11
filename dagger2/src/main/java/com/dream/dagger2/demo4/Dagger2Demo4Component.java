package com.dream.dagger2.demo4;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by SuSong on 2017/10/10.
 */

@Singleton
@Component(modules = Dagger2Demo4Module.class)
public interface Dagger2Demo4Component {
    void inject(Dagger2Demo4Application dagger2Demo4Application);

    void inject(Dagger2Demo4Activity dagger2Demo4Activity);
}
