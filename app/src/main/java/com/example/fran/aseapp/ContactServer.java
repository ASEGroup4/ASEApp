package com.example.fran.aseapp;

import android.app.IntentService;
import android.content.Intent;

/**
 * Created by Lucas on 16/10/16.
 */

public class ContactServer extends IntentService {

    /**
     * Creates an IntentService.  Invoked by your subclass's constructor.
     */
    public ContactServer() {
        super(ContactServer.class.getName());
    }

    @Override
    protected void onHandleIntent(Intent intent) {
        // add java code to send data to the server
    }
}
