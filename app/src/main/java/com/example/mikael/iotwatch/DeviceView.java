package com.example.mikael.iotwatch;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;

/**
 * Created by Mikael on 2015-10-03.
 */
public class DeviceView {

    private float fov;

    public DeviceView(Context context) {
//        super(context);
        init(context);
    }
//
//    public DeviceView(Context context, AttributeSet attrs) {
//        super(context, attrs);
//        init(context);
//    }
//
//    public DeviceView(Context context, AttributeSet attrs, int defStyleAttr) {
//        super(context, attrs, defStyleAttr);
//        init(context);
//    }

    private void init(Context context){
        fov = 90;
        
//        setImageResource(R.drawable.lightbulb);
//        RelativeLayout rel = (RelativeLayout) findViewById(R.id.topRelative);
//        rel.addView(this);

    }
}
