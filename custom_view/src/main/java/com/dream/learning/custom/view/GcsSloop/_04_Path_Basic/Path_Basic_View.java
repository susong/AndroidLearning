package com.dream.learning.custom.view.GcsSloop._04_Path_Basic;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;

/**
 * Author:      SuSong
 * Email:       751971697@qq.com
 * GitHub:      https://github.com/susong7519
 * Date:        2017/10/17 下午4:17
 * Description: AndroidLearning
 */
public class Path_Basic_View extends View {

    private Paint mPaint;
    private int   mWidth;
    private int   mHeight;

    public Path_Basic_View(Context context) {
        this(context, null);
    }

    public Path_Basic_View(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        initPaint();
    }

    private void initPaint() {
        mPaint = new Paint();                   // 创建画笔
        mPaint.setColor(Color.BLACK);           // 画笔颜色 - 黑色
        mPaint.setStyle(Paint.Style.STROKE);    // 填充模式 - 描边
        mPaint.setStrokeWidth(10);              // 边框宽度 - 10
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

        canvas.translate(100, 100);

        // 第1组: moveTo、 setLastPoint、 lineTo 和 close
        Path path;

        // lineTo
        path = new Path();
        path.lineTo(200, 200);
        path.lineTo(200, 0);
        canvas.drawPath(path, mPaint);

        // moveTo
        path = new Path();
        path.moveTo(300, 0);
        path.lineTo(300, 200);
        canvas.drawPath(path, mPaint);

        // setLastPoint
        path = new Path();
        path.moveTo(400, 0);
        path.lineTo(400, 200);
        path.setLastPoint(400, 100);
        canvas.drawPath(path, mPaint);

        // close
        path = new Path();
        path.moveTo(500, 0);
        path.lineTo(700, 300);
        path.lineTo(700, 0);
        path.close();
        canvas.drawPath(path, mPaint);


        // 画布位移回原点
        canvas.restore();
        canvas.save();

        canvas.translate(mWidth / 2, 700);

        // 第2组: addXxx与arcTo
        path = new Path();
        path.addRect(-200, -200, 200, 200, Path.Direction.CW);//顺时针
        canvas.drawPath(path, mPaint);

        canvas.translate(0, 500);

        path = new Path();
        path.addRect(-200, -200, 200, 200, Path.Direction.CCW);//逆时针
        canvas.drawPath(path, mPaint);

        canvas.translate(0, 500);

        path = new Path();
        path.addRect(-200, -200, 200, 200, Path.Direction.CW);
        path.setLastPoint(-300, 300);
        canvas.drawPath(path, mPaint);

        canvas.translate(0, 600);

        path = new Path();
        path.addRect(-200, -200, 200, 200, Path.Direction.CCW);
        path.setLastPoint(-300, 300);
        canvas.drawPath(path, mPaint);


        // 第二类(Path)
        canvas.translate(0, 700);
        canvas.scale(1, -1);        // <-- 注意 翻转y坐标轴
        path = new Path();
        Path src = new Path();

        path.addRect(-200, -200, 200, 200, Path.Direction.CW);
        src.addCircle(0, 0, 100, Path.Direction.CW);

        path.addPath(src, 0, 200);

        canvas.drawPath(path, mPaint);

        // 画布位移回原点
        canvas.restore();
        canvas.save();


        // 第三类(addArc与arcTo)
        // addArc
        canvas.translate(mWidth / 2, 3600);
        canvas.scale(1, -1);                // <-- 注意 翻转y坐标轴
        path = new Path();
        path.lineTo(100, 100);

        RectF oval = new RectF(0, 0, 300, 300);
        path.addArc(oval, 0, 270);
//        path.arcTo(oval, 0, 270, true);     // <-- 和上面一句作用等价

        canvas.drawPath(path, mPaint);


        // 画布位移回原点
        canvas.restore();
        canvas.save();

        // arcTo
        canvas.translate(mWidth / 2, 4000);
        canvas.scale(1, -1);                // <-- 注意 翻转y坐标轴

        path = new Path();
        path.lineTo(100, 100);

        oval = new RectF(0, 0, 300, 300);
        path.arcTo(oval, 0, 270, false);

        canvas.drawPath(path, mPaint);


        // 第3组：isEmpty、 isRect、isConvex、 set 和 offset
        // isEmpty 判断path中是否包含内容。
        path = new Path();
        Log.d("xlog", "1 " + path.isEmpty());

        path.lineTo(100, 100);
        Log.d("xlog", "2 " + path.isEmpty());

        // isRect 判断path是否是一个矩形，如果是一个矩形的话，会将矩形的信息存放进参数rect中。
        path = new Path();
        path.lineTo(0, 400);
        path.lineTo(400, 400);
        path.lineTo(400, 0);
        path.lineTo(0, 0);

        RectF   rect = new RectF();
        boolean b    = path.isRect(rect);
        Log.d("xlog", "isRect:" + b + "| left:" + rect.left + "| top:" + rect.top + "| right:" + rect.right + "| bottom:" + rect.bottom);

        // set 将新的path赋值到现有path。

        // 画布位移回原点
        canvas.restore();
        canvas.save();

        canvas.translate(mWidth / 2, 4200);

        path = new Path();
        path.addRect(-200, -200, 200, 200, Path.Direction.CW);

        src = new Path();
        src.addCircle(0, 0, 100, Path.Direction.CW);

        path.set(src);

        canvas.drawPath(path, mPaint);

        // 画布位移回原点
        canvas.restore();
        canvas.save();

        // offset
        canvas.translate(mWidth / 2, 4500);
        path = new Path();
        path.addCircle(0, 0, 100, Path.Direction.CW);

        Path dst = new Path();
        dst.addRect(-200, -200, 200, 200, Path.Direction.CW);

        path.offset(300, 0, dst);

        canvas.drawPath(path, mPaint);

//        mPaint.setColor(Color.BLUE);

        canvas.drawPath(dst, mPaint);

    }
}
