package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.os.Build;
import android.support.annotation.Nullable;
import android.support.annotation.RequiresApi;
import android.util.AttributeSet;
import android.view.View;

public class Practice11PieChartView extends View {

    public Practice11PieChartView(Context context) {
        super(context);
    }

    public Practice11PieChartView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice11PieChartView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        //        综合练习
        //        练习内容：使用各种 Canvas.drawXXX() 方法画饼图
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setColor(Color.RED);
        canvas.drawArc(50, 50, 450, 450, -180, 135, true, paint);
        paint.setColor(Color.YELLOW);
        canvas.drawArc(70, 70, 470, 470, -45, 40, true, paint);
        paint.setColor(Color.WHITE);
        canvas.drawArc(70, 70, 470, 470, -5, 5, true, paint);
        paint.setColor(Color.BLACK);
        canvas.drawArc(70, 70, 470, 470, 0, 10, true, paint);
        paint.setColor(Color.BLUE);
        canvas.drawArc(70, 70, 470, 470, 12, 10, true, paint);
        paint.setColor(Color.RED);
        canvas.drawArc(70, 70, 470, 470,25, 50, true, paint);
        paint.setColor(Color.BLACK);
        canvas.drawArc(70, 70, 470, 470, 80, 100, true, paint);
    }
}
