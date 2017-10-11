package com.dream.dagger2.demo10;

/**
 * Created by SuSong on 2017/10/11.
 */

public class Dagger2Demo10BBean {
    private Dagger2Demo10ABean mDagger2Demo10ABean;

    public Dagger2Demo10BBean(Dagger2Demo10ABean dagger2Demo10ABean) {
        mDagger2Demo10ABean = dagger2Demo10ABean;
    }
}
