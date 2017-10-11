package com.dream.dagger2.demo7;

import dagger.Component;

/**
 * Created by SuSong on 2017/10/11.
 */

@Dagger2Demo7PerActivity
@Component(dependencies = Dagger2Demo7ApplicationComponent.class, modules = Dagger2Demo7ActivityModule.class)
public interface Dagger2Demo7ActivityComponent {
    void inject(Dagger2Demo7Activity dagger2Demo7Activity);
}
