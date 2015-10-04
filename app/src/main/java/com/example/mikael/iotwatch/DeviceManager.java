package com.example.mikael.iotwatch;

import android.content.Context;

import java.util.ArrayList;

/**
 * Created by Mikael on 2015-10-03.
 */
public class DeviceManager {
    ArrayList<Device> devices;
    Context context;
    public DeviceManager(){
        devices = new ArrayList<Device>();
        this.context = context;
        //Populate the list from connected devices
        //Temporarily hard coded, will later be imported from saved XML data.
        populate_devices();
    }

    private void populate_devices (){
        devices.add(new Device(1,1,10));
    }
}
