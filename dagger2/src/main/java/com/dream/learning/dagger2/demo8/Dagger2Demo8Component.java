package com.dream.learning.dagger2.demo8;

import dagger.Component;

/**
 * Author:      SuSong
 * Email:       751971697@qq.com
 * GitHub:      https://github.com/susong7519
 * Date:        2017/10/11 下午2:14
 * Description: AndroidLearning
 */
@Component(modules = Dagger2Demo8Module.class)
public interface Dagger2Demo8Component {
    void inject(Dagger2Demo8Activity dagger2Demo8Activity);
}
