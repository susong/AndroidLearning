package com.dream.learning.dagger2.demo5;

import android.content.Context;

import javax.inject.Inject;

/**
 * Author:      SuSong
 * Email:       751971697@qq.com
 * GitHub:      https://github.com/susong7519
 * Date:        2017/10/10 下午2:14
 * Description: AndroidLearning
 */
public class Dagger2Demo5Bean {

    private Context mContext;

    @Inject
    public Dagger2Demo5Bean(Context context) {
        mContext = context;
    }
}
