package com.dream.learning.custom.view;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.dream.learning.android.learning.support.AndroidLearningSupport;

/**
 * Created by SuSong on 2017/10/12.
 */

public class CustomViewActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        AndroidLearningSupport.loadData(this, R.raw.custom_view_item_list);
    }
}
