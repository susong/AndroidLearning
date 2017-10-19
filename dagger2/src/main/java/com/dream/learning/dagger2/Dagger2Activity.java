package com.dream.learning.dagger2;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.dream.learning.android.learning.support.AndroidLearningSupport;

/**
 * Author:      SuSong
 * Email:       751971697@qq.com
 * GitHub:      https://github.com/susong7519
 * Date:        2017/10/10 下午2:14
 * Description: AndroidLearning
 */
public class Dagger2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        AndroidLearningSupport.init(this, R.raw.dagger2_item_list);
    }
}

