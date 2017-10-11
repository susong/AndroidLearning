package com.dream.dagger2.demo5;

import android.content.Context;

import javax.inject.Inject;

/**
 * Created by SuSong on 2017/10/10.
 */

public class Dagger2Demo5Bean {

    private Context mContext;

    @Inject
    public Dagger2Demo5Bean(Context context) {
        mContext = context;
    }
}
