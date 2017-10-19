package com.dream.learning.custom.view.GcsSloop._01_Canvas_BasicGraphics;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

/**
 * Author:      SuSong
 * Email:       751971697@qq.com
 * GitHub:      https://github.com/susong7519
 * Date:        2017/10/13 下午2:14
 * Description: AndroidLearning
 */
public class Canvas_BasicGraphics_View extends View {

    // 1.创建一个画笔
    private Paint mPaint = new Paint();

    public Canvas_BasicGraphics_View(Context context) {
        this(context, null);
    }

    // 3.在构造函数中初始化
    public Canvas_BasicGraphics_View(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        initPaint();
    }

    // 2.初始化画笔
    private void initPaint() {
        mPaint.setColor(Color.RED);//设置画笔颜色
        mPaint.setStyle(Paint.Style.FILL);//设置画笔模式为填充
        mPaint.setStrokeWidth(10f);//设置画笔宽度为10px
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        //设置宽度和高度
        setMeasuredDimension(widthMeasureSpec, 5000);
    }

    @TargetApi(Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        // 绘制颜色是填充整个画布，常用于绘制底色。
        canvas.drawColor(Color.rgb(199, 237, 204));//绘制护眼色


        // 绘制点
        canvas.drawPoint(100, 100, mPaint);

        canvas.drawPoints(new float[]{
                200, 100,
                300, 100,
                400, 100
        }, mPaint);


        // 绘制直线
        canvas.drawLine(100, 200, 300, 300, mPaint);

        canvas.drawLines(new float[]{
                400, 200, 500, 200,
                600, 200, 800, 200
        }, mPaint);


        // 绘制矩形
        canvas.drawRect(100, 400, 800, 500, mPaint);

        canvas.drawRect(new Rect(100, 600, 800, 700), mPaint);

        canvas.drawRect(new RectF(100, 800, 800, 900), mPaint);


        // 绘制圆角矩形
        canvas.drawRoundRect(100, 1000, 800, 1100, 30, 30, mPaint);

        canvas.drawRoundRect(new RectF(100, 1200, 800, 1300), 50, 30, mPaint);

        // 矩形
        RectF rectF = new RectF(100, 1400, 800, 1500);
        // 绘制背景矩形
        mPaint.setColor(Color.GRAY);
        canvas.drawRect(rectF, mPaint);
        // 绘制圆角矩形
        mPaint.setColor(Color.RED);
        canvas.drawRoundRect(rectF, 350, 50, mPaint);


        // 绘制椭圆
        canvas.drawOval(100, 1600, 800, 1700, mPaint);

        canvas.drawOval(new RectF(100, 1800, 800, 1900), mPaint);


        // 绘制圆
        canvas.drawCircle(200, 2100, 100, mPaint);


        // 绘制圆弧
        RectF rectF1 = new RectF(100, 2300, 800, 2400);
        // 绘制背景矩形
        mPaint.setColor(Color.GRAY);
        canvas.drawRect(rectF1, mPaint);
        // 绘制圆弧
        mPaint.setColor(Color.RED);
        canvas.drawArc(rectF1, 0, 90, false, mPaint);

        // 绘制圆弧
        RectF rectF2 = new RectF(100, 2500, 800, 2600);
        // 绘制背景矩形
        mPaint.setColor(Color.GRAY);
        canvas.drawRect(rectF2, mPaint);
        // 绘制圆弧
        mPaint.setColor(Color.RED);
        canvas.drawArc(rectF2, 0, 90, true, mPaint);


        // Paint
        Paint paint = new Paint();
        paint.setColor(Color.BLUE);
        paint.setStrokeWidth(40);

        // 描边
        paint.setStyle(Paint.Style.STROKE);
        canvas.drawCircle(200, 2800, 100, paint);

        // 填充
        paint.setStyle(Paint.Style.FILL);
        canvas.drawCircle(200, 3100, 100, paint);

        // 描边加填充
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        canvas.drawCircle(200, 3400, 100, paint);
    }
}



















