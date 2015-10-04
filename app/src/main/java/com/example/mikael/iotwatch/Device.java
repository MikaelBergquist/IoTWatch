package com.example.mikael.iotwatch;

import android.content.Context;
import android.widget.ImageView;

import com.google.android.gms.common.data.DataBufferObserver;

/**
 * Created by Mikael on 2015-10-03.
 */
public class Device {

    private int id, type;
    private float angle_degrees, angle_relative;
    DeviceView dv;


    public Device(int id, int type, float angle_degree){
        this.id = id;
        this.type = type;
        this.angle_degrees = angle_degree;

        //create new DeviceView and attach it to this.
    }

    public void updateRelativeAngle(float angle){
        //Update relative angle when a new position is added
        //Set view to show new position


    }


}
