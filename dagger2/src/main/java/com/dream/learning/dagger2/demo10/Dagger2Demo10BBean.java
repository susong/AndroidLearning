package com.dream.learning.dagger2.demo10;

/**
 * Author:      SuSong
 * Email:       751971697@qq.com
 * GitHub:      https://github.com/susong7519
 * Date:        2017/10/11 下午2:14
 * Description: AndroidLearning
 */
public class Dagger2Demo10BBean {
    private Dagger2Demo10ABean mDagger2Demo10ABean;

    public Dagger2Demo10BBean(Dagger2Demo10ABean dagger2Demo10ABean) {
        mDagger2Demo10ABean = dagger2Demo10ABean;
    }
}
