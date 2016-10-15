import java.net.*;
import java.io.*;

public class main {



    public static void main(String[] args) throws IOException{

        String name = "testName"; //Change these if you want to make (max 20 chars)
        String id = "1234";         // max 4 digits


        String urlString = "https://users.sussex.ac.uk/~sl410/php/index.php?name=" + name + "&id=" + id;

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
            while((g = in.readLine()) != null){
                result += g;
            }
            in.close();

        }finally {
            connection.disconnect();
            System.out.println(result);
        }


    }
}
