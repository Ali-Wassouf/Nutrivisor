package com.example.nutrivisor;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class output extends Activity {
	
	TextView result  , bmii ; 
	Button ok ; 
	@Override
	  public void onCreate(Bundle savedInstanceState)
	{
	        super.onCreate(savedInstanceState);
	        setContentView(R.layout.output);
	        result = (TextView) findViewById(R.id.result);
	        //bmii = (TextView) findViewById(R.id.bmi);
	        Intent i = getIntent();
	        String resultstring = i.getStringExtra("result");
	      //  String bmi = i.getStringExtra("bmi");
	       // bmii.setText(bmi);
	        result.setText(resultstring);
	        ok = (Button) findViewById(R.id.ok);
	        ok.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View arg0) {
					
					finish();
					
				}
			});
	}

}
