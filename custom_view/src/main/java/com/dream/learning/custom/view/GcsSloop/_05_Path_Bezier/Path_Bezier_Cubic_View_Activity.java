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
 * Date:        2017/10/19 上午10:59
 * Description: AndroidLearning
 */
public class Path_Bezier_Cubic_View_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gcssloop_path_bezier_cubic_view);

        final Path_Bezier_Cubic_View view = (Path_Bezier_Cubic_View) findViewById(R.id.view);

        findViewById(R.id.rb_control1).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                view.setMode(true);
            }
        });

        findViewById(R.id.rb_control2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                view.setMode(false);
            }
        });
    }
}
