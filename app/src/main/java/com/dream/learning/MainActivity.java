package com.dream.learning;

import com.dream.learning.android.learning.support.AndroidLearningSupportActivity;


public class MainActivity extends AndroidLearningSupportActivity {

    /**
     * 直接跳转到某个Activity
     *
     * @return
     */
    @Override
    protected Class getActivityClass() {
//        return GcsSloopDemo1Activity.class;
        return super.getActivityClass();
    }

    /**
     * 直接加载某个layout
     *
     * @return
     */
    @Override
    protected int getLayoutResID() {
//        return R.layout.activity_gcssloop_demo1;
        return super.getLayoutResID();
    }

    /**
     * 初始的raw中的json文件数据
     *
     * @return
     */
    @Override
    protected int getRawResID() {
        return R.raw.item_list;
    }
}
