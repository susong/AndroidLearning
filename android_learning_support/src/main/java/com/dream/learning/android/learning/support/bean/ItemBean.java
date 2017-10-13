package com.dream.learning.android.learning.support.bean;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * Author:      SuSong
 * Email:       751971697@qq.com
 * GitHub:      https://github.com/susong7519
 * Date:        2017/10/13 下午2:14
 * Description: AndroidLearning
 */
public class ItemBean implements Serializable {

    private String title;
    private String activity;
    private String layout;
    private String view;
    private String raw;
    private String detail;
    private ArrayList<ItemBean> mItemBeanArrayList = new ArrayList<>();

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getActivity() {
        return activity;
    }

    public void setActivity(String activity) {
        this.activity = activity;
    }

    public String getLayout() {
        return layout;
    }

    public void setLayout(String layout) {
        this.layout = layout;
    }

    public String getView() {
        return view;
    }

    public void setView(String view) {
        this.view = view;
    }

    public String getRaw() {
        return raw;
    }

    public void setRaw(String raw) {
        this.raw = raw;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public ArrayList<ItemBean> getItemBeanArrayList() {
        return mItemBeanArrayList;
    }

    public void setItemBeanArrayList(ArrayList<ItemBean> itemBeanArrayList) {
        mItemBeanArrayList = itemBeanArrayList;
    }

    @Override
    public String toString() {
        return title;
    }
}
