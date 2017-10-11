package com.dream.dagger2.demo8;

import dagger.Component;

/**
 * Created by SuSong on 2017/10/11.
 */

@Component(modules = Dagger2Demo8Module.class)
public interface Dagger2Demo8Component {
    void inject(Dagger2Demo8Activity dagger2Demo8Activity);
}
