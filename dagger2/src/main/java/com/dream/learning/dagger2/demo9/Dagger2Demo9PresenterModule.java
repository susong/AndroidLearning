package com.dream.learning.dagger2.demo9;

import dagger.Module;
import dagger.Provides;

/**
 * Author:      SuSong
 * Email:       751971697@qq.com
 * GitHub:      https://github.com/susong7519
 * Date:        2017/10/11 下午2:14
 * Description: AndroidLearning
 */
@Module
public class Dagger2Demo9PresenterModule {

    @Provides
    Dagger2Demo9BBean provideDagger2Demo9BBean(Dagger2Demo9ABean dagger2Demo9ABean) {
        return new Dagger2Demo9BBean(dagger2Demo9ABean);
    }
}
