package com.dream.learning.dagger2.demo2;

import dagger.Component;

/**
 * Author:      SuSong
 * Email:       751971697@qq.com
 * GitHub:      https://github.com/susong7519
 * Date:        2017/10/10 下午2:14
 * Description: AndroidLearning
 */
@Component(modules = Dagger2Demo2Module.class)
public interface Dagger2Demo2Component {
    void inject(Dagger2Demo2Activity dagger2Demo2Activity);
}
