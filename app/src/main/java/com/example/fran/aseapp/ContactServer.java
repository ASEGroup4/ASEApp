package com.example.fran.aseapp;

import android.app.IntentService;
import android.content.Intent;
import android.icu.text.SimpleDateFormat;
import android.icu.util.Calendar;
import android.provider.Settings;
import android.util.Log;
import android.widget.Toast;
import android.provider.Settings.Secure;
import java.net.*;
import java.io.*;
import java.util.Date;
/**
 * Created by Lucas on 16/10/16.
 */

public class ContactServer extends IntentService  {

    /**
     * Creates an IntentService.  Invoked by your subclass's constructor.
     */
    public ContactServer() {
        super("ContactServer");
    }

    @Override
    protected void onHandleIntent(Intent intent) {
        String android_id = Secure.getString(this.getContentResolver(),
                Settings.Secure.ANDROID_ID);
        Log.d("Locations", "Writing location to DB");
        double locationLat = intent.getDoubleExtra("locationLat",0);
        double locationLong = intent.getDoubleExtra("locationLong",0);





        Calendar c = Calendar.getInstance();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String strDate = sdf.format(c.getTime());



        String urlString = "http://54.190.44.242/asegroup4/index.php?locationLat=" + locationLat + "&locationLong=" + locationLong+"&id=" + android_id + "&time=" + strDate;
        try {
            URL url = new URL(urlString);


            String result = "";
            String data = "fName=" + URLEncoder.encode("Atli", "UTF-8");
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            try {
                connection.setDoInput(true);
                connection.setDoOutput(true);
                connection.setUseCaches(false);
                connection.setRequestMethod("POST");
                connection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");

                DataInputStream in = new DataInputStream(connection.getInputStream());

                String g;
                while ((g = in.readLine()) != null) {
                    result += g;
                }
                in.close();

            } finally {
                connection.disconnect();
                System.out.println(result);
            }


        }catch(Exception e){

            Log.d("php", "php Error Likely");
        }
    }
        // add java code to send data to the server
}

