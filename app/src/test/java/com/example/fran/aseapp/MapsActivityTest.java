package com.example.fran.aseapp;

import android.app.Activity;
import android.content.Context;
import android.net.wifi.WifiManager;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

/**
 * Created by stan on 02/11/16.
 */

@RunWith(MockitoJUnitRunner.class)
public class MapsActivityTest {
    MapsActivity mapsActivity;
    MenuActivity menuActivity;

    @Mock
    Context mockContext = mock(Context.class);

    MapsActivity mockActivity = mock(MapsActivity.class);
    WifiManager mockWifiManager = mock(WifiManager.class);

    @Before
    public void initialize(){
        //mapsActivity = new MapsActivity();
    }

    @Test
    public void checkWifiTest(){
        when(mockContext.getSystemService(mockContext.WIFI_SERVICE)).thenReturn(mockWifiManager);
        when(mockWifiManager.isWifiEnabled()).thenReturn(true);
        Boolean result = mockActivity.checkWifi().booleanValue();
        Boolean expected = true;
        assertTrue(result == true);
        //assertEquals(expected, result);
    }
}
