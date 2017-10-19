package com.dream.learning.dagger2.demo4;

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
@Component(modules = Dagger2Demo4Module.class)
public interface Dagger2Demo4Component {
    void inject(Dagger2Demo4Application dagger2Demo4Application);

    void inject(Dagger2Demo4Activity dagger2Demo4Activity);
}
