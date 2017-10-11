package com.dream.dagger2.demo2;

import dagger.Module;
import dagger.Provides;

/**
 * Created by SuSong on 2017/10/10.
 */

@Module
public class Dagger2Demo2Module {

    @Provides
    Dagger2Demo2Bean provideInjectModuleTestBean() {
        return new Dagger2Demo2Bean();
    }
}
