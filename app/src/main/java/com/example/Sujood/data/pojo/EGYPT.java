package com.example.Sujood.data.pojo;

import android.location.Location;

public class EGYPT implements IToMethod {
    public int id;
    public String name;
    public Params params;
    public Location location;

    @Override
    public PrayerTimingMethod toMethod() {
        return new PrayerTimingMethod(id,name,params,location);
    }
}
