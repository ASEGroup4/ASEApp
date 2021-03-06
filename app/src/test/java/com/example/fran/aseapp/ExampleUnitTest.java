package com.example.fran.aseapp;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * To work on unit tests, switch the Test Artifact in the Build Variants view.
 */
public class ExampleUnitTest {
    MapsActivity mapsActivity;
    ContactServer contactServer;


    @Before
    public void initialize(){
        mapsActivity = new MapsActivity();
        contactServer = new ContactServer();
    }


    @Test
    public void addition_isCorrect() throws Exception {
        assertEquals(4, 2 + 2);
    }

    @Test
    public void testConnection() throws Exception {
        int val = contactServer.serverConnect(50.123, 0.123, "ASS", "0");
            assertEquals(2, val);
    }


}