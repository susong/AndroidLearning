package com.dream.learning.custom.view.GcsSloop._03_Canvas_PictureText;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.dream.learning.custom.view.R;

/**
 * Author:      SuSong
 * Email:       751971697@qq.com
 * GitHub:      https://github.com/susong7519
 * Date:        2017/10/16 下午6:31
 * Description: AndroidLearning
 */
public class Canvas_PictureText_CheckView_Activity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_canvas_picturetext_checkview);

        final Canvas_PictureText_CheckView cv = (Canvas_PictureText_CheckView) findViewById(R.id.cv);

        findViewById(R.id.bt_check).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cv.check();
            }
        });

        findViewById(R.id.bt_uncheck).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cv.unCheck();
            }
        });
    }
}
