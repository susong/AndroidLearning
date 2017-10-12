package com.dream.learning.dagger2.demo9;

import dagger.Module;
import dagger.Provides;

/**
 * Created by SuSong on 2017/10/11.
 */
@Module
public class Dagger2Demo9Module {
    @Provides
    Dagger2Demo9ABean provideDagger2Demo9ABean() {
        return new Dagger2Demo9ABean();
    }

    @Provides
    Dagger2Demo9AHideBean provideDagger2Demo9AHideBean(){
        return new Dagger2Demo9AHideBean();
    }
}
