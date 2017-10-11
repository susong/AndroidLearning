package com.dream.bean;

/**
 * Created by SuSong on 2017/10/11.
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
