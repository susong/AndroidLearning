package com.dream.learning.dagger2.demo7;

import dagger.Component;

/**
 * Author:      SuSong
 * Email:       751971697@qq.com
 * GitHub:      https://github.com/susong7519
 * Date:        2017/10/11 下午2:14
 * Description: AndroidLearning
 */
@Dagger2Demo7PerActivity
@Component(dependencies = Dagger2Demo7ApplicationComponent.class, modules = Dagger2Demo7ActivityModule.class)
public interface Dagger2Demo7ActivityComponent {
    void inject(Dagger2Demo7Activity dagger2Demo7Activity);
}
