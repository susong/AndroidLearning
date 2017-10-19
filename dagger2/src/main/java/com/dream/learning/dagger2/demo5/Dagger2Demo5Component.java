package com.dream.learning.dagger2.demo5;

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
@Component(modules = Dagger2Demo5Module.class)
public interface Dagger2Demo5Component {
    void inject(Dagger2Demo5Activity dagger2Demo5Activity);
}
