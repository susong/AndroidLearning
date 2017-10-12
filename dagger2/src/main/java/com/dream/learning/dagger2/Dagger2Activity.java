package com.dream.learning.dagger2;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.dream.learning.android.learning.support.AndroidLearningSupport;

/**
 * Created by SuSong on 2017/10/10.
 */

public class Dagger2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        AndroidLearningSupport.loadData(this, R.raw.dagger2_item_list);
    }
}

