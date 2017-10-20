package com.dream.learning.custom.view.GcsSloop._05_Path_Bezier;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.dream.learning.custom.view.R;

/**
 * Author:      SuSong
 * Email:       751971697@qq.com
 * GitHub:      https://github.com/susong7519
 * Date:        2017/10/19 下午6:24
 * Description: AndroidLearning
 */
public class MagicCircleViewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_magic_circle_view);

        final MagicCircleView view = (MagicCircleView) findViewById(R.id.view);
        findViewById(R.id.bt_start).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                view.startAnimation();
            }
        });
    }
}
