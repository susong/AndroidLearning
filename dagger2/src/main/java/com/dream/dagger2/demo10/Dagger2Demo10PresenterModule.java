package com.dream.dagger2.demo10;

import dagger.Module;
import dagger.Provides;

/**
 * Created by SuSong on 2017/10/11.
 */
@Module
public class Dagger2Demo10PresenterModule {

    @Provides
    Dagger2Demo10BBean provideDagger2Demo10BBean(Dagger2Demo10ABean dagger2Demo10ABean) {
        return new Dagger2Demo10BBean(dagger2Demo10ABean);
    }
}
