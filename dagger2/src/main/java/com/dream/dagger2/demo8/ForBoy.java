package com.dream.dagger2.demo8;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import javax.inject.Qualifier;

/**
 * Created by SuSong on 2017/10/11.
 */

@Qualifier
@Retention(RetentionPolicy.RUNTIME)
public @interface ForBoy {
}
