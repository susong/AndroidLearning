package com.dream.learning;

import com.dream.learning.android.learning.support.AndroidLearningSupportActivity;
import com.dream.learning.custom.view.GcsSloop._05_Path_Bezier.MagicCircleViewActivity;

/**
 * Author:      SuSong
 * Email:       751971697@qq.com
 * GitHub:      https://github.com/susong7519
 * Date:        2017/10/13 下午2:14
 * Description: AndroidLearning
 */
public class MainActivity extends AndroidLearningSupportActivity {

    /**
     * 直接跳转到某个Activity
     *
     * @return
     */
    @Override
    protected Class getActivityClass() {
        return MagicCircleViewActivity.class;
//        return super.getActivityClass();
    }

    /**
     * 直接加载某个View
     *
     * @return
     */
    @Override
    protected Class getViewClass() {
//        return MagicCircleView.class;
        return super.getViewClass();
    }


    /**
     * 直接加载某个layout
     *
     * @return
     */
    @Override
    protected int getLayoutResID() {
//        return R.layout.view_radar;
        return super.getLayoutResID();
    }

    /**
     * 是否需要包含在ScrollView中
     *
     * @return
     */
    protected boolean isLong() {
//        return true;
        return false;
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
