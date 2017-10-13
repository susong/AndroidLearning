package com.dream.learning.custom.view.gcssloop.demo1;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import java.util.ArrayList;

/**
 * Created by SuSong on 2017/10/12.
 */

public class GcsSloopDemo1Activity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_gcssloop_demo1);

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
