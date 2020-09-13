package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;
import android.graphics.Paint;
import android.graphics.Color;

public class Practice2DrawCircleView extends View {

    public Practice2DrawCircleView(Context context) {
        super(context);
    }

    public Practice2DrawCircleView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice2DrawCircleView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

//        练习内容：使用 canvas.drawCircle() 方法画圆
//        一共四个圆：1.实心圆 2.空心圆 3.蓝色实心圆 4.线宽为 20 的空心圆
		Paint paint = new Paint(Paint.ANTI_ALIAS_FLAG);
		paint.setStyle(Paint.Style.FILL);
		canvas.drawCircle(300, 300, 150, paint);

		paint.setStyle(Paint.Style.STROKE);
		canvas.drawCircle(700, 300, 150, paint);

		paint.setColor(Color.BLUE);
		paint.setStyle(Paint.Style.FILL);
		canvas.drawCircle(300, 700, 150, paint);

		paint.setStyle(Paint.Style.STROKE);
		paint.setStrokeWidth(20);
		canvas.drawCircle(700, 700, 150, paint);

    }
}
