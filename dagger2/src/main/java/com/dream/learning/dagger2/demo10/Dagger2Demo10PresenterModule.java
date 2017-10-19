package com.dream.learning.dagger2.demo10;

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
public class Dagger2Demo10PresenterModule {

    @Provides
    Dagger2Demo10BBean provideDagger2Demo10BBean(Dagger2Demo10ABean dagger2Demo10ABean) {
        return new Dagger2Demo10BBean(dagger2Demo10ABean);
    }
}
