package com.dream.learning.dagger2.demo9;

import dagger.Component;

/**
 * Author:      SuSong
 * Email:       751971697@qq.com
 * GitHub:      https://github.com/susong7519
 * Date:        2017/10/11 下午2:14
 * Description: AndroidLearning
 */
@Component(modules = Dagger2Demo9PresenterModule.class, dependencies = Dagger2Demo9Component.class)
public interface Dagger2Demo9PresenterComponent {
    void inject(Dagger2Demo9Activity dagger2Demo9Activity);
}
