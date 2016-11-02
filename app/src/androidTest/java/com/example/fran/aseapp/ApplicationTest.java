package com.example.fran.aseapp;

import android.app.Application;
import android.support.test.runner.AndroidJUnit4;
import android.test.ApplicationTestCase;
import android.test.suitebuilder.annotation.SmallTest;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

/**
 * <a href="http://d.android.com/tools/testing/testing_android.html">Testing Fundamentals</a>
 */

@RunWith(AndroidJUnit4.class)
@SmallTest
public class ApplicationTest extends ApplicationTestCase<Application> {

    MapsActivity mapsActivity;

    public ApplicationTest() {
        super(Application.class);
    }

    @Before
    public void initialize(){
        mapsActivity = new MapsActivity();
    }

    @Test
    public void testWifiChecker(){
        Boolean expectedResult = true;
        Boolean actualResult = mapsActivity.checkWifi();
        assertEquals(actualResult, expectedResult);
    }
}