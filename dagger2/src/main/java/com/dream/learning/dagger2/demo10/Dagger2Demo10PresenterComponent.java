package com.dream.learning.dagger2.demo10;

import dagger.Subcomponent;

/**
 * Created by SuSong on 2017/10/11.
 */
@Subcomponent(modules = Dagger2Demo10PresenterModule.class)
public interface Dagger2Demo10PresenterComponent {
    void inject(Dagger2Demo10Activity dagger2Demo10Activity);
}
