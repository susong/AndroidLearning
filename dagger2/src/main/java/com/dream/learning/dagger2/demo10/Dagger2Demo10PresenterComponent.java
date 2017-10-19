package com.dream.learning.dagger2.demo10;

import dagger.Subcomponent;

/**
 * Author:      SuSong
 * Email:       751971697@qq.com
 * GitHub:      https://github.com/susong7519
 * Date:        2017/10/11 下午2:14
 * Description: AndroidLearning
 */
@Subcomponent(modules = Dagger2Demo10PresenterModule.class)
public interface Dagger2Demo10PresenterComponent {
    void inject(Dagger2Demo10Activity dagger2Demo10Activity);
}
