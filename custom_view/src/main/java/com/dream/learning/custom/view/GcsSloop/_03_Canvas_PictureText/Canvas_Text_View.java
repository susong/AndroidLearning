package com.dream.learning.custom.view.GcsSloop._03_Canvas_PictureText;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

/**
 * Author:      SuSong
 * Email:       751971697@qq.com
 * GitHub:      https://github.com/susong7519
 * Date:        2017/10/17 上午10:49
 * Description: AndroidLearning
 */
public class Canvas_Text_View extends View {

    private Paint mPaint;

    public Canvas_Text_View(Context context) {
        this(context, null);
    }

    public Canvas_Text_View(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        initPaint();
    }

    private void initPaint() {
        mPaint = new Paint();
        mPaint.setColor(Color.BLACK);
        mPaint.setStyle(Paint.Style.FILL);
        mPaint.setTextSize(50);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        // 文本(要绘制的内容)
        String str = "ABCDEFG";

        // 参数分别为 (文本 基线x 基线y 画笔)
        canvas.drawText(str, 100, 100, mPaint);

        // 参数分别为 (字符串 开始截取位置 结束截取位置 基线x 基线y 画笔)
        canvas.drawText(str, 1, 3, 100, 200, mPaint);

        // 字符数组(要绘制的内容)
        char[] chars = "ABCDEFG".toCharArray();

        // 参数为 (字符数组 起始坐标 截取长度 基线x 基线y 画笔)
        canvas.drawText(chars, 1, 3, 100, 300, mPaint);

        str = "sloop";

        canvas.drawPosText(str, new float[]{
                100, 400,
                150, 450,
                200, 500,
                250, 550,
                300, 600
        }, mPaint);
    }
}
