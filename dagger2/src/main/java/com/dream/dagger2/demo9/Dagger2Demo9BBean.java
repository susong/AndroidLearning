package com.dream.dagger2.demo9;

/**
 * Created by SuSong on 2017/10/11.
 */

public class Dagger2Demo9BBean {
    private Dagger2Demo9ABean mDagger2Demo9ABean;

    public Dagger2Demo9BBean(Dagger2Demo9ABean dagger2Demo9ABean) {
        mDagger2Demo9ABean = dagger2Demo9ABean;
    }
}
