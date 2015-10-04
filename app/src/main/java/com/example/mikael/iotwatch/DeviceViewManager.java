package com.example.mikael.iotwatch;

import android.content.Context;
import android.os.AsyncTask;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;

/**
 * Created by Mikael on 2015-10-03.
 */
public class DeviceViewManager extends RelativeLayout{
    private DeviceManager deviceManager;
    private Context context;

    public DeviceViewManager(Context context) {
        super(context);
        init(context);
    }

    public DeviceViewManager(Context context, AttributeSet attrs) {
        super(context, attrs);
        init(context);
    }

    public DeviceViewManager(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init(context);
    }

    public DeviceViewManager(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
        init(context);
    }



    private void init(Context context){
        this.context = context;

    }

    public void updateRelative(int degrees){
        ImageView image = new ImageView(context);
        image.setImageResource(R.drawable.lightbulb);
        RelativeLayout.LayoutParams params = new RelativeLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        params.addRule(RelativeLayout.ALIGN_PARENT_LEFT, RelativeLayout.TRUE);
        params.leftMargin = 107;
        params.height = 60;
        params.width = 60;
        RelativeLayout dvm = (RelativeLayout) findViewById(R.id.iconArea);
        dvm.addView(image, params);
    }

}
