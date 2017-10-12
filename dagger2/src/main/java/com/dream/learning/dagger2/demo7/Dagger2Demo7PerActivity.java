package com.dream.learning.dagger2.demo7;

import java.lang.annotation.Retention;

import javax.inject.Scope;

import static java.lang.annotation.RetentionPolicy.RUNTIME;

/**
 * Created by SuSong on 2017/10/11.
 */
@Scope
@Retention(RUNTIME)
public @interface Dagger2Demo7PerActivity {
}
