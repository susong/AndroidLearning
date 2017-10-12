package com.dream.learning.android.learning.support.bean;

/**
 * Created by SuSong on 2017/10/12.
 */

public class ItemBean {
    private String title;
    private String activity;
    private String detail;

    public String getTitle() {
        return title;
    }

    public String getActivity() {
        return activity;
    }

    public String getDetail() {
        return detail;
    }

    @Override
    public String toString() {
        return title;
    }
}
