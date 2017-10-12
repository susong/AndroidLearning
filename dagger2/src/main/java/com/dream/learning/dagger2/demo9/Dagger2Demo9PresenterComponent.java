package com.dream.learning.dagger2.demo9;

import dagger.Component;

/**
 * Created by SuSong on 2017/10/11.
 */
@Component(modules = Dagger2Demo9PresenterModule.class, dependencies = Dagger2Demo9Component.class)
public interface Dagger2Demo9PresenterComponent {
    void inject(Dagger2Demo9Activity dagger2Demo9Activity);
}
