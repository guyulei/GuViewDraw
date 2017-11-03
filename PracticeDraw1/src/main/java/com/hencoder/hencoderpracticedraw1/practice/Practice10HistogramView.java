package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

public class Practice10HistogramView extends View {

    public Practice10HistogramView(Context context) {
        super(context);
    }

    public Practice10HistogramView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice10HistogramView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        //        综合练习
        //        练习内容：使用各种 Canvas.drawXXX() 方法画直方图

        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(Color.WHITE);
        canvas.drawLine(50, 20, 50, 400, paint);
        canvas.drawLine(50, 400, 650, 400, paint);
        //
        paint.setTextSize(18);
        canvas.drawText("Froyo", 70, 420, paint);
        canvas.drawText("GB", 150, 420, paint);
        canvas.drawText("IC S", 230, 420, paint);
        canvas.drawText("JB", 310, 420, paint);
        canvas.drawText("KitKat", 390, 420, paint);
        canvas.drawText("L", 470, 420, paint);
        canvas.drawText("M", 550, 420, paint);
        paint.setTextSize(30);
        canvas.drawText("直方图", 310, 500, paint);
        //
        paint.setColor(Color.BLUE);
        paint.setStyle(Paint.Style.FILL);
        canvas.drawRect(60, 399, 120, 400, paint);
        canvas.drawRect(130, 370, 190, 400, paint);
        canvas.drawRect(210, 370, 270, 400, paint);
        canvas.drawRect(290, 300, 350, 400, paint);
        canvas.drawRect(370, 150, 430, 400, paint);
        canvas.drawRect(450, 100, 510, 400, paint);
        canvas.drawRect(530, 300, 590, 400, paint);
    }
}
