package com.dream.learning.dagger2.demo6;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Author:      SuSong
 * Email:       751971697@qq.com
 * GitHub:      https://github.com/susong7519
 * Date:        2017/10/10 下午2:14
 * Description: AndroidLearning
 */
@Singleton
@Component(modules = Dagger2Demo6Module.class)
public interface Dagger2Demo6Component {
    void inject(Dagger2Demo6Activity dagger2Demo6Activity);
}
