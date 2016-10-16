import java.net.*;
import java.io.*;

public class send {



    public static void main(String[] args) throws IOException{

	
	String location = "789789789";
	String userID = "434434434";
	String time = "2016-10-16 14:21:15";

        String urlString = "https://users.sussex.ac.uk/~sl410/php/index.php?location=" + location + "&id=" + userID + "&time=" + time;

        URL url = new URL(urlString);

	HttpURLConnection connection = (HttpURLConnection) url.openConnection();
	
	try{
		connection.setDoInput(true);
		connection.setDoOutput(true);
		connection.setUseCaches(false);
		connection.setRequestMethod("POST");
		connection.setRequestProperty("Conetent-Type", "application/x-www-form-urlencoded");
	}finally{
		connection.disconnect();
	}
	

	/*
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
            while((g = in.readLine()) != null){
                result += g;
            }
            in.close();

        }finally {
            connection.disconnect();
            System.out.println(result);
        }
	*/


    }
}
