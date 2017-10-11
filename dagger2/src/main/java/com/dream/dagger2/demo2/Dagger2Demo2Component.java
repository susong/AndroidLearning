package com.dream.dagger2.demo2;

import dagger.Component;

/**
 * Created by SuSong on 2017/10/10.
 */

@Component(modules = Dagger2Demo2Module.class)
public interface Dagger2Demo2Component {
    void inject(Dagger2Demo2Activity dagger2Demo2Activity);
}
