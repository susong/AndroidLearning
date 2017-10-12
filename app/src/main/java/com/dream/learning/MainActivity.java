package com.dream.learning;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.dream.learning.android.learning.support.AndroidLearningSupport;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        AndroidLearningSupport.loadData(this, R.raw.item_list);
    }
}
