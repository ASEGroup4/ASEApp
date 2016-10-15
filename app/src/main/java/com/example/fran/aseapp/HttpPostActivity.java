package com.example.fran.aseapp;

public class HttpPostActivity extends Activity{
	
	private String device_id;
	private String url;
	
	public void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		setContentView(R.layout.NULL);
		
		device_id = Secure.getString(getContext().getContentResolver(), secure.ANDROID_ID);
		url = "whatever the webpage is.php";
		
		sendData();
	}
	
	
	public void sendData(int location){
		URL url = new URL("url");
		URLConnection connection = url.openConnection();
	}
}