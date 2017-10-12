package com.dream.learning.dagger2.demo8;

import javax.inject.Named;

import dagger.Module;
import dagger.Provides;

/**
 * Created by SuSong on 2017/10/11.
 */
@Module
public class Dagger2Demo8Module {


    @Provides
    Dagger2Demo8Bean provideDefault() {
        return new Dagger2Demo8Bean(-1);
    }

    @Named("boy")
    @Provides
    Dagger2Demo8Bean provideBoy() {
        return new Dagger2Demo8Bean(1);
    }

    @Named("girl")
    @Provides
    Dagger2Demo8Bean provideGirl() {
        return new Dagger2Demo8Bean(0);
    }

    @ForBoy
    @Provides
    Dagger2Demo8Bean provideForBoy() {
        return new Dagger2Demo8Bean(11);
    }

    @ForGirl
    @Provides
    Dagger2Demo8Bean provideForGirl() {
        return new Dagger2Demo8Bean(110);
    }
}
