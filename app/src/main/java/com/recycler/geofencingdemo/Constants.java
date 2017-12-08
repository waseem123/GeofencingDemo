package com.recycler.geofencingdemo;

import com.google.android.gms.maps.model.LatLng;

import java.util.HashMap;

/**
 * Created by Manu on 11/24/2017.
 */

public class Constants {


    public static final String GEOFENCE_ID = "TACME";
    public static final float GEOFENCE_RADIUS_IN_METERS = 100;

    /**
     * Map for storing information about tacme in the dubai.
     */
    public static final HashMap<String, LatLng> AREA_LANDMARKS = new HashMap<String, LatLng>();

    static {
        // Tacme
        AREA_LANDMARKS.put(GEOFENCE_ID, new LatLng(25.116354, 55.390398));
    }
}