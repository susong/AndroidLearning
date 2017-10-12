package com.dream.learning.custom.view.gcssloop;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.dream.learning.android.learning.support.AndroidLearningSupport;
import com.dream.learning.custom.view.R;

/**
 * Created by SuSong on 2017/10/12.
 */

public class GcsSloopActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        AndroidLearningSupport.loadData(this, R.raw.gcssloop_item_list);
    }
}
