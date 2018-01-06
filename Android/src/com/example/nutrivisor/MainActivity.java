package com.example.nutrivisor;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.PrintStream;
import java.net.InetAddress;
import java.net.Socket;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import java.net.*;
public class MainActivity extends Activity {
	private Socket socket = null ;
	private final static int port = 8080 ; 
	private static String ip ;
	private PrintWriter out; 
	private static InputStreamReader inputStreamReader;
	   private static BufferedReader bufferedReader;
	EditText iptext ;
	Button startconnection;
	TextView TV ; 
	Button send ;
	Button Show ; 
	String message ,mes ;
	public  String gender , athlete , purge , constipation;
	public  String age ; 
	public   String weight , hight ;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		Show = (Button) findViewById(R.id.Show);
		Show.setEnabled(false);
		startconnection = (Button) findViewById(R.id.start);
		//send = (Button ) findViewById(R.id.send);
		//TV = (TextView ) findViewById(R.id.view);
		startconnection.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0)  {
				iptext = (EditText) findViewById(R.id.iptext);
				ip = iptext.getText().toString();
				Log.e("string",ip);
				Intent input = new Intent();
				input.setClass(MainActivity.this, input.class);
				//Intent nextScreen = new Intent(getApplicationContext(), input.class);
				startActivityForResult(input, 100);
				Show.setEnabled(true);
				new Thread(new Connect()).start();
				startconnection.setEnabled(false);
				
				
			}
		});
		Show.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
			
				out.println(age);
				out.println(athlete);
				out.println(purge);
				out.println(constipation);
				out.println(weight);
				out.println(hight);
				out.println(gender);
				Intent nextScreen = new Intent(getApplicationContext(), output.class);
				nextScreen.putExtra("result", message);
			//	nextScreen.putExtra("bmi",calculatebmi());
				 startActivity(nextScreen);
				 
				 
			}
		});
	}
	public String calculatebmi()
	{
		int   h , w ;
		double bmi ;
		String bmii ="no bmi" ;
		h = Integer.parseInt(hight);
		w = Integer.parseInt(weight);
		bmi = (w / (h*h))*10000;
		if (bmi >= 16 && bmi<=18.5 )
		{
			bmii = "your bmi is "+bmi +"\nyou're under_weight the recomanded needs for you is :";
			return bmii ;
		}
		if (bmi > 18.5 && bmi<=25 )
		{
			bmii = "your bmi is "+bmi +"\nyou're normal the recomanded needs for you is :";
			return bmii ;
		}
		if (bmi > 25 && bmi<=30 )
		{
			bmii = "your bmi is "+bmi +"\nyou're over_weight the recomanded needs for you is :";
			return bmii ;
		}
		return bmii ;
		
		
	}
	@Override
    protected void onActivityResult(int requestCode,int resultCode, Intent data) {
        if(resultCode == 100){
              age =  data.getStringExtra("age");
              gender =  data.getStringExtra("gender");
              hight =  data.getStringExtra("height");
              weight =  data.getStringExtra("weight");
              purge =  data.getStringExtra("purge");
              constipation = data.getStringExtra("constipation");
              athlete =  data.getStringExtra("athlete");
              
        }
 
    }
	class Connect implements Runnable
	{
		public void run ()
		{
			
            try {
            	InetAddress serverAddr = InetAddress.getByName(ip);
				socket = new Socket(serverAddr,port);
				out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(socket.getOutputStream())),true);
				inputStreamReader = new InputStreamReader(socket.getInputStream());
	            bufferedReader = new BufferedReader(inputStreamReader);
	           message =  bufferedReader.readLine();
	            mes = bufferedReader.readLine();
	          //  TV.setText(message);
				// TV.setText(mes);
				//socket.close();
			} catch (UnknownHostException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				Log.e("Uknown host",e.toString());
			}catch (IOException e )
			{
				Log.e("IO",e.toString());
			}
            catch(Exception e)
            {
            	e.printStackTrace();
            	Log.e("Exception ",e.toString());
            }
             
		}
	}
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
