package com.dream.learning.custom.view.GcsSloop._03_Canvas_PictureText;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Picture;
import android.graphics.Rect;
import android.graphics.drawable.PictureDrawable;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

import com.dream.learning.custom.view.R;

/**
 * Author:      SuSong
 * Email:       751971697@qq.com
 * GitHub:      https://github.com/susong7519
 * Date:        2017/10/16 下午3:42
 * Description: AndroidLearning
 */
public class Canvas_Picture_View extends View {

    private Paint   mPaint   = new Paint();
    // 1.创建Picture
    private Picture mPicture = new Picture();
    private int mWidth;
    private int mHeight;

    // 2.录制内容方法
    private void recording() {
        // 开始录制 (接收返回值Canvas)
        Canvas canvas = mPicture.beginRecording(500, 500);
        // 创建一个画笔
        Paint paint = new Paint();
        paint.setColor(Color.BLUE);
        paint.setStyle(Paint.Style.FILL);

        // 在Canvas中具体操作
        // 位移
        canvas.translate(250, 250);

        // 绘制一个圆
        canvas.drawCircle(0, 0, 100, paint);

        mPicture.endRecording();
    }

    public Canvas_Picture_View(Context context) {
        this(context, null);
    }

    // 3.在使用前调用(我在构造函数中调用了)
    public Canvas_Picture_View(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        recording();    // 调用录制
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
        setMeasuredDimension(widthMeasureSpec, 5000);
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

        // drawPicture
        // 1.使用Picture提供的draw方法绘制:
//        mPicture.draw(canvas);

        // 2.使用Canvas提供的drawPicture方法绘制
//        canvas.drawPicture(mPicture, new RectF(0, 0, mPicture.getWidth(), 200));

        // 3.将Picture包装成为PictureDrawable，使用PictureDrawable的draw方法绘制。
        // 包装成为Drawable
        PictureDrawable pictureDrawable = new PictureDrawable(mPicture);
        // 设置绘制区域 -- 注意此处所绘制的实际内容不会缩放
        pictureDrawable.setBounds(0, 0, 250, mPicture.getHeight());
        // 绘制
        pictureDrawable.draw(canvas);


        // drawBitmap
        Bitmap bitmap = BitmapFactory.decodeResource(getContext().getResources(), R.drawable.a);

        // 第一种方法
        canvas.drawBitmap(bitmap, new Matrix(), new Paint());

        // 第二种方法
        canvas.drawBitmap(bitmap, 200, 800, new Paint());

        // 第三种方法
        canvas.translate(mWidth / 2, 1600);
        Rect src = new Rect(0, 0, bitmap.getWidth() / 2, bitmap.getHeight() / 2);
        Rect dst = new Rect(0, 0, 200, 400);
        canvas.drawBitmap(bitmap, src, dst, null);
    }
}
