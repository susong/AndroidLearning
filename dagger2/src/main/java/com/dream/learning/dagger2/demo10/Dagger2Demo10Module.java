package com.dream.learning.dagger2.demo10;

import dagger.Module;
import dagger.Provides;

/**
 * Created by SuSong on 2017/10/11.
 */
@Module
public class Dagger2Demo10Module {
    @Provides
    Dagger2Demo10ABean provideDagger2Demo10ABean() {
        return new Dagger2Demo10ABean();
    }

    @Provides
    Dagger2Demo10AHideBean provideDagger2Demo10AHideBean(){
        return new Dagger2Demo10AHideBean();
    }
}
