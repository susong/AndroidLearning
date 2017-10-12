package com.dream.learning.dagger2.demo9;

import dagger.Module;
import dagger.Provides;

/**
 * Created by SuSong on 2017/10/11.
 */
@Module
public class Dagger2Demo9PresenterModule {

    @Provides
    Dagger2Demo9BBean provideDagger2Demo9BBean(Dagger2Demo9ABean dagger2Demo9ABean) {
        return new Dagger2Demo9BBean(dagger2Demo9ABean);
    }
}
