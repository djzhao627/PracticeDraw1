package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;
import android.graphics.Paint;
import android.graphics.Color;
import android.graphics.RectF;
import android.graphics.Path;

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

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

//        综合练习
//        练习内容：使用各种 Canvas.drawXXX() 方法画饼图

		Paint p =new Paint(Paint.ANTI_ALIAS_FLAG);
		RectF r =new RectF(300, 300, 800, 800);

		p.setColor(Color.parseColor("#cccccc"));
		Path pa = new Path();
		pa.moveTo(280, 300);
		pa.lineTo(400, 300);
		pa.lineTo(430, 430);
		pa.moveTo(600, 500);
		pa.lineTo(800, 450);
		pa.lineTo(900, 450);
		pa.moveTo(700, 580);
		pa.lineTo(830, 580);
		pa.lineTo(850, 600);
		pa.lineTo(900, 600);
		pa.moveTo(600, 700);
		pa.lineTo(830, 700);
		pa.moveTo(500, 600);
		pa.lineTo(380, 750);
		pa.lineTo(300, 750);
		p.setStyle(Paint.Style.STROKE);
		p.setStrokeWidth(3);
		canvas.drawPath(pa, p);
		

		p.setStyle(Paint.Style.FILL);
		p.setStrokeWidth(3);
		p.setTextSize(18);
		canvas.drawText("djzhao", 0, 6, 200, 305, p);
		canvas.drawText("awesome", 0, 7, 200, 755, p);
		canvas.drawText("every", 0, 5, 920, 455, p);
		canvas.drawText("thing", 0, 5, 920, 605, p);
		canvas.drawText("is", 0, 2, 850, 705, p);
		

		p.setColor(Color.YELLOW);
		canvas.drawArc(r, -45, 44, true, p);
		p.setColor(Color.parseColor("#8C6E6C"));
		canvas.drawArc(r, 2, 13, true, p);
		p.setColor(Color.parseColor("#999999"));
		canvas.drawArc(r, 17, 60, true, p);
		p.setColor(Color.parseColor("#767AC1"));
		canvas.drawArc(r, 79, 101, true, p);
		r = new RectF(290, 290, 790, 790);
		p.setColor(Color.parseColor("#FF3D2E"));
		canvas.drawArc(r, 182, 131, true, p);
    }
}
