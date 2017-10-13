package com.dream.learning.android.learning.support;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.dream.learning.android.learning.support.bean.ItemBean;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.lang.reflect.Type;
import java.util.ArrayList;

/**
 * Created by SuSong on 2017/10/12.
 */

public class AndroidLearningSupport {

    public static void init(final Context context, final int resId) {
        try {

            Activity activity = (Activity) context;
            activity.setContentView(R.layout.activity_android_learning_support);
            ListView listView = activity.findViewById(R.id.lv_item);

            final ArrayList<ItemBean> itemBeanArrayList = loadData(context, resId);
            listView.setAdapter(new ArrayAdapter<ItemBean>(context, android.R.layout.simple_list_item_1, android.R.id.text1, itemBeanArrayList));
            listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                    try {
                        context.startActivity(new Intent(context, Class.forName(itemBeanArrayList.get(position).getActivity())));
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            });
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * 加载raw中的json文件数据
     *
     * @param context
     * @param rawResID
     * @return
     */
    static ArrayList<ItemBean> loadData(final Context context, int rawResID) {
        ArrayList<ItemBean> itemBeanArrayList = null;
        try {
            ByteArrayOutputStream baos  = new ByteArrayOutputStream();
            BufferedInputStream   bis   = new BufferedInputStream(context.getResources().openRawResource(rawResID));
            int                   len;
            byte                  buf[] = new byte[1024];
            while ((len = bis.read(buf)) != -1) {
                baos.write(buf, 0, len);
            }
            final String json = baos.toString();
            Log.d("XLog", "json: \r\n" + json);
            Gson gson = new Gson();
            Type type = new TypeToken<ArrayList<ItemBean>>() {}.getType();
            itemBeanArrayList = gson.fromJson(json, type);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return itemBeanArrayList;
    }
}
