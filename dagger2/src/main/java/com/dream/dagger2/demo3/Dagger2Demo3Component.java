package com.dream.dagger2.demo3;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by SuSong on 2017/10/10.
 */

@Singleton
@Component(modules = Dagger2Demo3Module.class)
public interface Dagger2Demo3Component {
    void inject(Dagger2Demo3Activity dagger2Demo3Activity);
}
