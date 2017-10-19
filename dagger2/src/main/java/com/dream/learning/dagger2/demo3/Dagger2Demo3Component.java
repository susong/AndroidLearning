package com.dream.learning.dagger2.demo3;

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
@Component(modules = Dagger2Demo3Module.class)
public interface Dagger2Demo3Component {
    void inject(Dagger2Demo3Activity dagger2Demo3Activity);
}
