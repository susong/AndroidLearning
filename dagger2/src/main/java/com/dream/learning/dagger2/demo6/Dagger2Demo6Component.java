package com.dream.learning.dagger2.demo6;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by SuSong on 2017/10/10.
 */

@Singleton
@Component(modules = Dagger2Demo6Module.class)
public interface Dagger2Demo6Component {
    void inject(Dagger2Demo6Activity dagger2Demo6Activity);
}
