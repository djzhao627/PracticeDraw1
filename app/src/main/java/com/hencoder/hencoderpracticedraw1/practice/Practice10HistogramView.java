package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;
import android.graphics.Paint;
import android.graphics.Color;

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
		Paint p = new Paint(Paint.ANTI_ALIAS_FLAG);

		p.setColor(Color.GREEN);
		p.setStyle(Paint.Style.FILL);
		canvas.drawRect(310, 350, 390, 600, p);
		canvas.drawRect(410, 390, 490, 600, p);
		canvas.drawRect(510, 200, 590, 600, p);
		canvas.drawRect(610, 70, 690, 600, p);
		canvas.drawRect(710, 390, 790, 600, p);
		canvas.drawRect(810, 120, 890, 600, p);

		p.setColor(Color.WHITE);
		p.setStrokeWidth(5);
		p.setTextSize(24);

		String txt ="djzhao, life is a tale";
		canvas.drawText(txt, 0, 2, 320, 630, p);
		canvas.drawText(txt, 2, 6, 420, 630, p);
		canvas.drawText(txt, 8, 12, 520, 630, p);
		canvas.drawText(txt, 13, 15, 620, 630, p);
		canvas.drawText(txt, 16, 17, 720, 630, p);
		canvas.drawText(txt, 18, 22, 820, 630, p);
		
		p.setTextSize(48);
		canvas.drawText("直方图", 0, 3, 530, 750, p);

		float[] lines = {300, 300, 300, 600, 300, 600, 900, 600};
		canvas.drawLines(lines, p);
    }
}
