package com.dream.learning.dagger2.demo8;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import javax.inject.Qualifier;

/**
 * Author:      SuSong
 * Email:       751971697@qq.com
 * GitHub:      https://github.com/susong7519
 * Date:        2017/10/11 下午2:14
 * Description: AndroidLearning
 */
@Qualifier
@Retention(RetentionPolicy.RUNTIME)
public @interface ForGirl {
}
