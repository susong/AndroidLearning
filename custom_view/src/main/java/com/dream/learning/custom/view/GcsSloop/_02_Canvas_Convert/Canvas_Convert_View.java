package com.dream.learning.custom.view.GcsSloop._02_Canvas_Convert;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

/**
 * Author:      SuSong
 * Email:       751971697@qq.com
 * GitHub:      https://github.com/susong7519
 * Date:        2017/10/16 上午11:23
 * Description: AndroidLearning
 */
public class Canvas_Convert_View extends View {

    private Paint mPaint = new Paint();
    private int mWidth;
    private int mHeight;

    public Canvas_Convert_View(Context context) {
        this(context, null);
    }

    public Canvas_Convert_View(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        initPaint();
    }

    private void initPaint() {
        mPaint.setColor(Color.BLACK);
        mPaint.setStyle(Paint.Style.STROKE);
        mPaint.setAntiAlias(true);
        mPaint.setStrokeWidth(10f);
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        //设置宽度和高度
        setMeasuredDimension(widthMeasureSpec, 10000);
    }

    @Override
    protected void onSizeChanged(int w, int h, int oldw, int oldh) {
        super.onSizeChanged(w, h, oldw, oldh);
        mWidth = w;
        mHeight = h;
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        canvas.save();

        // ⑴位移(translate)
        // 在坐标原点绘制一个黑色圆形
        mPaint.setColor(Color.BLACK);
        canvas.translate(200, 200);
        canvas.drawCircle(0, 0, 100, mPaint);

        // 在坐标原点绘制一个蓝色圆形
        mPaint.setColor(Color.BLUE);
        canvas.translate(200, 200);
        canvas.drawCircle(0, 0, 100, mPaint);

        // 画布位移回原点
        canvas.restore();
        canvas.save();


        // ⑵缩放(scale)
        // 缩放1
        // 将坐标系原点移动到画布正中心
        canvas.translate(mWidth / 2, 1000);

        RectF rectF1 = new RectF(0, -400, 400, 0);   // 矩形区域

        mPaint.setColor(Color.BLACK);               // 绘制黑色矩形
        canvas.drawRect(rectF1, mPaint);

        canvas.scale(0.5f, 0.5f);                   // 画布缩放

        mPaint.setColor(Color.BLUE);                // 绘制蓝色矩形
        canvas.drawRect(rectF1, mPaint);

        // 画布还原
        canvas.restore();
        canvas.save();

        // 缩放2
        // 将坐标系原点移动到画布正中心
        canvas.translate(mWidth / 2, 1500);
        RectF rectF2 = new RectF(0, -400, 400, 0);  // 矩形区域

        mPaint.setColor(Color.BLACK);               // 绘制黑色矩形
        canvas.drawRect(rectF2, mPaint);

        canvas.scale(0.5f, 0.5f, 200, 0);           // 画布缩放  <-- 缩放中心向右偏移了200个单位

        mPaint.setColor(Color.BLUE);                // 绘制蓝色矩形
        canvas.drawRect(rectF2, mPaint);

        // 画布还原
        canvas.restore();
        canvas.save();

        // 缩放3
        // 将坐标系原点移动到画布正中心
        canvas.translate(mWidth / 2, 2000);
        RectF rectF3 = new RectF(0, -400, 400, 0);  // 矩形区域

        mPaint.setColor(Color.BLACK);               // 绘制黑色矩形
        canvas.drawRect(rectF3, mPaint);

        canvas.scale(-0.5f, -0.5f);                 // 画布缩放

        mPaint.setColor(Color.BLUE);                // 绘制蓝色矩形
        canvas.drawRect(rectF3, mPaint);

        // 画布还原
        canvas.restore();
        canvas.save();

        // 缩放4
        // 将坐标系原点移动到画布正中心
        canvas.translate(mWidth / 2, 2700);
        RectF rectF4 = new RectF(0, -400, 400, 0);  // 矩形区域

        mPaint.setColor(Color.BLACK);               // 绘制黑色矩形
        canvas.drawRect(rectF4, mPaint);

        canvas.scale(-0.5f, -0.5f, 200, 0);         // 画布缩放  <-- 缩放中心向右偏移了200个单位

        mPaint.setColor(Color.BLUE);                // 绘制蓝色矩形
        canvas.drawRect(rectF4, mPaint);

        // 画布还原
        canvas.restore();
        canvas.save();

        // 缩放5
        // 将坐标系原点移动到画布正中心
        canvas.translate(mWidth / 2, 3400);
        RectF rectF5 = new RectF(-400, -400, 400, 400);
        mPaint.setColor(Color.BLACK);
        for (int i = 0; i < 20; i++) {
            canvas.drawRect(rectF5, mPaint);
            canvas.scale(0.9f, 0.9f);
        }

        // 画布还原
        canvas.restore();
        canvas.save();

        // ⑶旋转(rotate)
        // 旋转1
        // 将坐标系原点移动到画布正中心
        canvas.translate(mWidth / 2, 4300);

        RectF rectF6 = new RectF(0, -400, 400, 0);  // 矩形区域

        mPaint.setColor(Color.BLACK);               // 绘制黑色矩形
        canvas.drawRect(rectF6, mPaint);

        canvas.rotate(180);                         // 旋转180度 <-- 默认旋转中心为原点

        mPaint.setColor(Color.BLUE);                // 绘制蓝色矩形
        canvas.drawRect(rectF6, mPaint);

        // 画布还原
        canvas.restore();
        canvas.save();

        // 旋转2
        // 将坐标系原点移动到画布正中心
        canvas.translate(mWidth / 2, 5200);

        RectF rectF7 = new RectF(0, -400, 400, 0);  // 矩形区域

        mPaint.setColor(Color.BLACK);               // 绘制黑色矩形
        canvas.drawRect(rectF7, mPaint);

        canvas.rotate(180, 200, 0);                 // 旋转180度 <-- 默认旋转中心为原点

        mPaint.setColor(Color.BLUE);                // 绘制蓝色矩形
        canvas.drawRect(rectF7, mPaint);

        // 画布还原
        canvas.restore();
        canvas.save();

        // 旋转3
        // 将坐标系原点移动到画布正中心
        canvas.translate(mWidth / 2, 6100);
        mPaint.setColor(Color.BLACK);

        // 绘制两个圆形
        canvas.drawCircle(0, 0, 400, mPaint);
        canvas.drawCircle(0, 0, 380, mPaint);

        // 绘制圆形之间的连接线
        for (int i = 0; i <= 360; i += 10) {
            canvas.drawLine(380, 0, 400, 0, mPaint);
            canvas.rotate(10);
        }

        // 画布还原
        canvas.restore();
        canvas.save();

        // ⑷错切(skew)
        // 错切1
        // 将坐标系原点移动到画布正中心
        canvas.translate(mWidth / 2, 6600);
        RectF rectF8 = new RectF(0, 0, 200, 200);  // 矩形区域

        mPaint.setColor(Color.BLACK);               // 绘制黑色矩形
        canvas.drawRect(rectF8, mPaint);

        canvas.skew(1, 0);

        mPaint.setColor(Color.BLUE);                // 绘制蓝色矩形
        canvas.drawRect(rectF8, mPaint);

        // 画布还原
        canvas.restore();
        canvas.save();

        // 错切2
        // 将坐标系原点移动到画布正中心
        canvas.translate(mWidth / 2, 6900);
        RectF rectF9 = new RectF(0, 0, 200, 200);  // 矩形区域

        mPaint.setColor(Color.BLACK);               // 绘制黑色矩形
        canvas.drawRect(rectF9, mPaint);

        canvas.skew(1, 0);
        canvas.skew(0, 1);

        mPaint.setColor(Color.BLUE);                // 绘制蓝色矩形
        canvas.drawRect(rectF9, mPaint);
    }
}
