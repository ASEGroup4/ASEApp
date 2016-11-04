package com.example.fran.aseapp;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by stan on 02/11/16.
 */

public class MapsActivityTest {
    MapsActivity mapsActivity;

    @Before
    public void initialize(){
        mapsActivity = new MapsActivity();
    }

    @Test
    public void checkWifiTest(){

        Boolean result = mapsActivity.checkWifi().booleanValue();
        Boolean expected = true;
        assertEquals(expected, result);
    }
}
