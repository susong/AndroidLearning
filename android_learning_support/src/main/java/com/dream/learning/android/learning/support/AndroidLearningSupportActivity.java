package com.dream.learning.android.learning.support;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.dream.learning.android.learning.support.bean.ItemBean;

import java.lang.reflect.Constructor;

/**
 * Author:      SuSong
 * Email:       751971697@qq.com
 * GitHub:      https://github.com/susong7519
 * Date:        2017/10/13 下午2:14
 * Description: AndroidLearning
 */
public class AndroidLearningSupportActivity extends AppCompatActivity {

    private ItemBean mItemBean;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        try {
            init();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void init() throws Exception {
        mItemBean = (ItemBean) getIntent().getSerializableExtra("data");

        if (mItemBean != null) {

            // 获取raw中的json文件数据
            if (!TextUtils.isEmpty(mItemBean.getRaw())) {
                // 通过字符串来使用R下面资源的ID值
                int rawResID = getResources().getIdentifier(mItemBean.getRaw(), "raw", getPackageName());
                mItemBean.setData(AndroidLearningSupport.loadData(this, rawResID));
            }

            // 获取布局
            if (!TextUtils.isEmpty(mItemBean.getLayout())) {
                // 通过字符串来使用R下面资源的ID值
                int layoutResID = getResources().getIdentifier(mItemBean.getLayout(), "layout", getPackageName());
                setContentView(layoutResID);
            } else if (!TextUtils.isEmpty(mItemBean.getView())) {
                // 传入的是自定义View的class，使用反射来生成对象。
                Class<?>       aClass      = Class.forName(mItemBean.getView());
                Constructor<?> constructor = aClass.getConstructor(Context.class);
                View           view        = (View) constructor.newInstance(this);
                setContentView(view);
            } else {
                setContentView(R.layout.activity_android_learning_support);
            }

            // 设置标题
            if (!TextUtils.isEmpty(mItemBean.getTitle())) {
                ActionBar actionBar = getSupportActionBar();
                if (actionBar != null) {
                    actionBar.setTitle(mItemBean.getTitle());
                }
            }
        } else {
            // 首页启动没有数据传入时
            mItemBean = new ItemBean();

            if (getRawResID() != -1) {
                mItemBean.setData(AndroidLearningSupport.loadData(this, getRawResID()));
            }

            if (getActivityClass() != null) {
                Intent intent = new Intent(AndroidLearningSupportActivity.this, getActivityClass());
                intent.putExtra("data", mItemBean);
                startActivity(intent);
                return;
            }

            if (getLayoutResID() != -1) {
                setContentView(getLayoutResID());
            } else {
                setContentView(R.layout.activity_android_learning_support);
            }
        }

        // 获取ListView，并设置数据和点击事件。
        ListView lvItem = (ListView) findViewById(R.id.lv_item);
        if (lvItem != null) {
            lvItem.setAdapter(new ArrayAdapter<ItemBean>(this, android.R.layout.simple_list_item_1, android.R.id.text1, mItemBean.getData()));
            lvItem.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                    try {
                        String activity = mItemBean.getData().get(position).getActivity();
                        if (TextUtils.isEmpty(activity)) {
                            activity = "com.dream.learning.MainActivity";
                        }
                        Intent intent = new Intent(AndroidLearningSupportActivity.this, Class.forName(activity));
                        intent.putExtra("data", mItemBean.getData().get(position));
                        startActivity(intent);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            });
        }
    }

    /**
     * 直接跳转到某个Activity
     *
     * @return
     */
    protected Class getActivityClass() {
        return null;
    }

    /**
     * 直接加载某个layout
     *
     * @return
     */
    protected int getLayoutResID() {
        return -1;
    }

    /**
     * 初始的raw中的json文件数据
     *
     * @return
     */
    protected int getRawResID() {
        return -1;
    }
}
