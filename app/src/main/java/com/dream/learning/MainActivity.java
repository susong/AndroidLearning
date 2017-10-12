package com.dream.learning;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.dream.learning.bean.ItemBean;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;


public class MainActivity extends AppCompatActivity {

    private ListView            mLvItem;
    private ArrayList<ItemBean> mItemListBean;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        mLvItem = (ListView) findViewById(R.id.lv_item);
        mLvItem.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                try {
                    startActivity(new Intent(MainActivity.this,Class.forName(mItemListBean.get(position).getActivity())));
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });

        loadData();
    }

    private void loadData() {
        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    ByteArrayOutputStream baos  = new ByteArrayOutputStream();
                    BufferedInputStream   bis   = new BufferedInputStream(getResources().openRawResource(R.raw.item_list));
                    int                   len;
                    byte                  buf[] = new byte[1024];
                    while ((len = bis.read(buf)) != -1) {
                        baos.write(buf, 0, len);
                    }
                    final String json = baos.toString();
                    Log.d("XLog", "json: \r\n" + json);

                    runOnUiThread(new Runnable() {
                        @Override
                        public void run() {
                            onLoadDataFinish(json);
                        }
                    });
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }).start();
    }

    private void onLoadDataFinish(String json) {
        Gson gson = new Gson();
        Type type = new TypeToken<ArrayList<ItemBean>>() {}.getType();
        mItemListBean = gson.fromJson(json, type);
        for (ItemBean bean : mItemListBean) {
            Log.d("XLog", "bean: " + bean);
        }
        mLvItem.setAdapter(new ArrayAdapter<ItemBean>(this, android.R.layout.simple_list_item_1, android.R.id.text1, mItemListBean));
    }
}
