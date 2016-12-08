package com.example.fran.aseapp;

<<<<<<< HEAD
import android.app.Activity;
import android.content.Context;
import android.net.wifi.WifiManager;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import static junit.framework.Assert.assertFalse;
import static org.mockito.Mockito.*;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
=======
import org.junit.Before;
>>>>>>> ff2a1d39512c29176043db6dfd9e73b60794345b

/**
 * Created by stan on 02/11/16.
 */

@RunWith(MockitoJUnitRunner.class)
public class MapsActivityTest {
<<<<<<< HEAD
    MapsActivity mapsActivity;


    /*
    Here we create mock objects that the tests will use.
    We can mock various android dependancies our app may have
     */
    @Mock
    Context mockContext = mock(Context.class);
    WifiManager mockWifiManager = mock(WifiManager.class);

    /*
    Here we initialize our maps activity that we want to test
     */
    @Before
    public void initialize(){
        mapsActivity = new MapsActivity();
    }

    /*
    A simple test to ensusre the checkWifi method is working correctly.
        when(mockWifiManager.isWifiEnabled()).thenReturn(true).thenReturn(false);
    This line allows us to define the behaviour of the mocked method.
    First time the mocked method is called it will return true, then return false.
    We then call the mapsActivity's method twice, to check that both  branches of the method work.
     */
    @Test
    public void checkWifiTest(){
        when(mockWifiManager.isWifiEnabled()).thenReturn(true).thenReturn(false);

        assertTrue(mapsActivity.checkWifi(mockWifiManager));
        assertFalse(mapsActivity.checkWifi(mockWifiManager));
=======
    MapsActivity

    @Before
    public void initialize(){

>>>>>>> ff2a1d39512c29176043db6dfd9e73b60794345b
    }
}
