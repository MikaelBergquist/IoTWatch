package com.example.mikael.iotwatch;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.support.v4.content.ContextCompat;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by Mikael on 2015-10-02.
 */
public class BackgroundDrawer extends View {
    //floats for circles.
    private float radius_outer, padding_top, x_outer , y_outer, radius_inner, x_inner,y_inner;

    //paints and colors.
    private Paint paint;
    private int color_outer, color_inner;

    //floats for triangle.
    private float triangle_base,triangle_height,triangle_width;


    public BackgroundDrawer(Context context) {
        super(context);
        padding_top = 10;

        x_outer = 0;
        y_outer = 0;
        radius_outer = 750;

        x_inner = 0;
        y_inner = 70;
        radius_inner = 700;


        triangle_height = 10;
        triangle_width = 28;

        init(context);
    }

    public BackgroundDrawer(Context context, AttributeSet attrs) {
        super(context, attrs);

        TypedArray a = context.getTheme().obtainStyledAttributes(
                attrs,
                R.styleable.BackgroundDrawer,
                0, 0);

        try {
            padding_top = a.getFloat(R.styleable.BackgroundDrawer_topPadding, 10);

            x_outer = a.getFloat(R.styleable.BackgroundDrawer_x_outer, 0);
            y_outer = a.getFloat(R.styleable.BackgroundDrawer_y_outer, 0);
            radius_outer = a.getFloat(R.styleable.BackgroundDrawer_radius_outer, 750);

            x_inner = a.getFloat(R.styleable.BackgroundDrawer_x_inner, 0);
            y_inner = a.getFloat(R.styleable.BackgroundDrawer_y_inner, 70);
            radius_inner = a.getFloat(R.styleable.BackgroundDrawer_radius_inner, 750);

            triangle_base = padding_top + y_inner+4;
            triangle_height =a.getFloat(R.styleable.BackgroundDrawer_triangle_height, 10);
            triangle_width = a.getFloat(R.styleable.BackgroundDrawer_triangle_width, 28);
        } finally {
            a.recycle();
        }

        init(context);
    }

    public BackgroundDrawer(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);

        TypedArray a = context.getTheme().obtainStyledAttributes(
                attrs,
                R.styleable.BackgroundDrawer,
                0, 0);

        try {
            padding_top = a.getFloat(R.styleable.BackgroundDrawer_topPadding, 10);

            x_outer = a.getFloat(R.styleable.BackgroundDrawer_x_outer, 0);
            y_outer = a.getFloat(R.styleable.BackgroundDrawer_y_outer, 0);
            radius_outer = a.getFloat(R.styleable.BackgroundDrawer_radius_outer, 750);

            x_inner = a.getFloat(R.styleable.BackgroundDrawer_x_inner, 0);
            y_inner = a.getFloat(R.styleable.BackgroundDrawer_y_inner, 70);
            radius_inner = a.getFloat(R.styleable.BackgroundDrawer_radius_inner, 750);

            triangle_base = padding_top + y_inner+4;
            triangle_height =a.getFloat(R.styleable.BackgroundDrawer_triangle_height, 10);
            triangle_width = a.getFloat(R.styleable.BackgroundDrawer_triangle_width,28);

        } finally {
            a.recycle();
        }

        init(context);
    }

    private void init(Context context) {

        paint = new Paint();
        paint.setAntiAlias(true);
        color_outer = ContextCompat.getColor(context, R.color.arch_color);
        color_inner = ContextCompat.getColor(context, R.color.background);

        triangle_base = padding_top + y_inner+4;
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        //Draw circles
        paint.setColor(color_outer);
        canvas.drawCircle(canvas.getWidth() / 2 + x_outer, radius_outer + padding_top + y_outer, radius_outer, paint);
        paint.setColor(color_inner);
        canvas.drawCircle(canvas.getWidth() / 2 + x_inner, radius_inner + padding_top + y_inner, radius_inner, paint);

        //draw triangle
        Path path = new Path();
        path.setFillType(Path.FillType.EVEN_ODD);
        path.moveTo(canvas.getWidth()/2 + triangle_width/2, triangle_base);
        path.lineTo(canvas.getWidth()/2 - triangle_width/2, triangle_base);
        path.lineTo(canvas.getWidth()/2, triangle_base-triangle_height);
        path.close();

        canvas.drawPath(path, paint);
    }
}


