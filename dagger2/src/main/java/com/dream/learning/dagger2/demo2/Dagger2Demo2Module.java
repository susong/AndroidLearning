package com.dream.learning.dagger2.demo2;

import dagger.Module;
import dagger.Provides;

/**
 * Author:      SuSong
 * Email:       751971697@qq.com
 * GitHub:      https://github.com/susong7519
 * Date:        2017/10/10 下午2:14
 * Description: AndroidLearning
 */
@Module
public class Dagger2Demo2Module {

    @Provides
    Dagger2Demo2Bean provideInjectModuleTestBean() {
        return new Dagger2Demo2Bean();
    }
}
