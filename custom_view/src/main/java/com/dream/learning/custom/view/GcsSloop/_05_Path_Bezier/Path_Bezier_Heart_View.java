package com.dream.learning.custom.view.GcsSloop._05_Path_Bezier;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

/**
 * Author:      SuSong
 * Email:       751971697@qq.com
 * GitHub:      https://github.com/susong7519
 * Date:        2017/10/19 上午11:26
 * Description: AndroidLearning
 */
public class Path_Bezier_Heart_View extends View {

    private static final float C = 0.551915024494f;     // 一个常量，用来计算绘制圆形贝塞尔曲线控制点的位置

    private Paint mPaint;
    private int   mCenterX, mCenterY;

    private PointF mCenter       = new PointF(0, 0);
    private float  mCircleRadius = 200;                 // 圆的半径
    private float  mDifference   = mCircleRadius * C;   // 圆形的控制点与数据点的差值

    private float[] mData = new float[8];               // 顺时针记录绘制圆形的四个数据点
    private float[] mCtrl = new float[16];              // 顺时针记录绘制圆形的八个控制点

    private float mDuration = 1000;                     // 变化总时长
    private float mCurrent  = 0;                        // 当前已进行时长
    private float mCount    = 100;                      // 将时长总共划分多少份
    private float mPiece    = mDuration / mCount;       // 每一份的时长


    public Path_Bezier_Heart_View(Context context) {
        this(context, null);
    }

    public Path_Bezier_Heart_View(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);

        mPaint = new Paint();
        mPaint.setColor(Color.BLACK);
        mPaint.setStrokeWidth(8);
        mPaint.setStyle(Paint.Style.STROKE);
        mPaint.setTextSize(60);

        // 初始化数据点
        mData[0] = 0;
        mData[1] = mCircleRadius;

        mData[2] = mCircleRadius;
        mData[3] = 0;

        mData[4] = 0;
        mData[5] = -mCircleRadius;

        mData[6] = -mCircleRadius;
        mData[7] = 0;

        // 初始化控制点
        mCtrl[0] = mData[0] + mDifference;
        mCtrl[1] = mData[1];

        mCtrl[2] = mData[0] - mDifference;
        mCtrl[3] = mData[1];

        mCtrl[4] = mData[2];
        mCtrl[5] = mData[3] + mDifference;

        mCtrl[6] = mData[2];
        mCtrl[7] = mData[3] - mDifference;

        mCtrl[8] = mData[4] + mDifference;
        mCtrl[9] = mData[5];

        mCtrl[10] = mData[4] - mDifference;
        mCtrl[11] = mData[5];

        mCtrl[12] = mData[6];
        mCtrl[13] = mData[7] + mDifference;

        mCtrl[14] = mData[6];
        mCtrl[15] = mData[7] - mDifference;
    }

    @Override
    protected void onSizeChanged(int w, int h, int oldw, int oldh) {
        super.onSizeChanged(w, h, oldw, oldh);
        mCenterX = w / 2;
        mCenterY = h / 2;
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        drawCoordinateSystem(canvas);

        canvas.translate(mCenterX, mCenterY); // 将坐标系移动到画布中央
//        canvas.scale(1, -1);                 // 翻转Y轴

        drawAuxiliaryLine(canvas);

        // 绘制贝塞尔曲线
        mPaint.setColor(Color.RED);
        mPaint.setStrokeWidth(8);

        Path path = new Path();
        path.moveTo(mData[0], mData[1]);

        path.cubicTo(mCtrl[0], mCtrl[1], mCtrl[4], mCtrl[5], mData[2], mData[3]);
        path.cubicTo(mCtrl[6], mCtrl[7], mCtrl[8], mCtrl[9], mData[4], mData[5]);
        path.cubicTo(mCtrl[10], mCtrl[11], mCtrl[14], mCtrl[15], mData[6], mData[7]);
        path.cubicTo(mCtrl[12], mCtrl[13], mCtrl[2], mCtrl[3], mData[0], mData[1]);

        canvas.drawPath(path, mPaint);

        mCurrent += mPiece;
        if (mCurrent < mDuration) {
            mData[5] += 120 / mCount;

            mCtrl[3] -= 80 / mCount;
            mCtrl[1] -= 80 / mCount;

            mCtrl[12] += 20 / mCount;
            mCtrl[4] -= 20 / mCount;

            postInvalidateDelayed((long) mPiece);
        }
    }

    // 绘制坐标系
    private void drawCoordinateSystem(Canvas canvas) {
        canvas.save();

        // 将坐标系移动到画布中央
        canvas.translate(mCenterX, mCenterY);
        // 翻转Y轴
//        canvas.scale(1, -1);

        Paint fuzhuPaint = new Paint();
        fuzhuPaint.setColor(Color.RED);
        fuzhuPaint.setStrokeWidth(5);
        fuzhuPaint.setStyle(Paint.Style.STROKE);

        canvas.drawLine(0, -2000, 0, 2000, fuzhuPaint);
        canvas.drawLine(-2000, 0, 2000, 0, fuzhuPaint);

        canvas.restore();
    }

    // 绘制辅助线
    private void drawAuxiliaryLine(Canvas canvas) {
        // 绘制数据点和控制点
        mPaint.setColor(Color.GRAY);
        mPaint.setStrokeWidth(20);

        for (int i = 0; i < 8; i += 2) {
            canvas.drawPoint(mData[i], mData[i + 1], mPaint);
        }

        for (int i = 0; i < 16; i += 2) {
            canvas.drawPoint(mCtrl[i], mCtrl[i + 1], mPaint);
        }

        // 绘制文字
        mPaint.setColor(Color.BLACK);
        mPaint.setStrokeWidth(4);
        mPaint.setTextSize(40);
        Paint.FontMetrics fontMetrics = mPaint.getFontMetrics();
        float             fontHeight  = fontMetrics.bottom - fontMetrics.top;
        for (int i = 0; i < 8; i += 2) {
            if (i == 0) {
                canvas.drawText(i + "", mData[i], mData[i + 1] + fontHeight * 2, mPaint);
            } else if (i == 2) {
                canvas.drawText(i + "", mData[i] + fontHeight, mData[i + 1], mPaint);
            } else if (i == 4) {
                canvas.drawText(i + "", mData[i], mData[i + 1] - fontHeight, mPaint);
            } else if (i == 6) {
                canvas.drawText(i + "", mData[i] - fontHeight * 2, mData[i + 1], mPaint);
            }
        }
        for (int i = 0; i < 16; i += 2) {
            if (i == 0 || i == 2) {
                canvas.drawText(i + "", mCtrl[i], mCtrl[i + 1] + fontHeight * 2, mPaint);
            } else if (i == 4 || i == 6) {
                canvas.drawText(i + "", mCtrl[i] + fontHeight, mCtrl[i + 1], mPaint);
            } else if (i == 8 || i == 10) {
                canvas.drawText(i + "", mCtrl[i], mCtrl[i + 1] - fontHeight, mPaint);
            } else if (i == 12 || i == 14) {
                canvas.drawText(i + "", mCtrl[i] - fontHeight * 2, mCtrl[i + 1], mPaint);
            }
        }

        // 绘制辅助线
        mPaint.setColor(Color.GRAY);
        mPaint.setStrokeWidth(4);
        for (int i = 0, j = 0; i < 8; i += 2, j += 4) {
            canvas.drawLine(mData[i], mData[i + 1], mCtrl[j], mCtrl[j + 1], mPaint);
            canvas.drawLine(mData[i], mData[i + 1], mCtrl[j + 2], mCtrl[j + 3], mPaint);
        }
    }
}
