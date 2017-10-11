package com.dream.dagger2.demo5;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by SuSong on 2017/10/10.
 */

@Singleton
@Component(modules = Dagger2Demo5Module.class)
public interface Dagger2Demo5Component {
    void inject(Dagger2Demo5Activity dagger2Demo5Activity);
}
