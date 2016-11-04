package com.example.fran.aseapp;

import org.junit.Before;
import org.junit.Test;

import android.app.Application;
import android.icu.text.SimpleDateFormat;
import android.icu.util.Calendar;
import android.test.ActivityInstrumentationTestCase2;

/**
 * Created by Lucas on 04/11/2016.
 *
 * ContactServerTest class is a JUnit class that tests the functionality of the ContactServer
 * class.
 */

public class ContactServerTest extends ActivityInstrumentationTestCase2<MapsActivity> {

    MapsActivity mapsActivity;
    ContactServer contactServer;

    public ContactServerTest() {
        super(MapsActivity.class);
    }

    @Override
    protected void setUp() throws Exception {
        super.setUp();

        mapsActivity = getActivity();
    }

    @Before
    public void before() {
        contactServer = new ContactServer();
    }


    @Test
    public void contactServerCreationTest() {
        final Application application = contactServer.getApplication();
        if (application.getClass().isInstance(ContactServer.class)) {
            assertTrue("Class is created", true);
        } else {
            assertTrue("Class is not created", false);
        }
    }

    @Test
    public void onHandleIntentTest() {
        //test on handle intent
    }


    @Test
    public void serverConnectSuccessfulTest() {
        Calendar c = Calendar.getInstance();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String strDate = sdf.format(c.getTime());

        int result_from_contactServer = contactServer.serverConnect(0,0,"test", strDate);
        System.out.println(result_from_contactServer);

        assertEquals(2, result_from_contactServer);
    }
}
