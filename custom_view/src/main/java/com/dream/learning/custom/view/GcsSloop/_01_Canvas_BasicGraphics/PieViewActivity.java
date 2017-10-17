package com.dream.learning.custom.view.GcsSloop._01_Canvas_BasicGraphics;

import android.os.Bundle;
import android.support.annotation.Nullable;

import com.dream.learning.android.learning.support.AndroidLearningSupportActivity;

import java.util.ArrayList;

/**
 * Author:      SuSong
 * Email:       751971697@qq.com
 * GitHub:      https://github.com/susong7519
 * Date:        2017/10/13 下午2:14
 * Description: AndroidLearning
 */
public class PieViewActivity extends AndroidLearningSupportActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        PieView pieView = new PieView(this);
        setContentView(pieView);

        ArrayList<PieData> datas    = new ArrayList<>();
        PieData            pieData  = new PieData("sloop", 60);
        PieData            pieData2 = new PieData("sloop", 30);
        PieData            pieData3 = new PieData("sloop", 40);
        PieData            pieData4 = new PieData("sloop", 20);
        PieData            pieData5 = new PieData("sloop", 20);
        datas.add(pieData);
        datas.add(pieData2);
        datas.add(pieData3);
        datas.add(pieData4);
        datas.add(pieData5);
        pieView.setData(datas);
    }
}
