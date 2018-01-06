package com.example.nutrivisor;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;
import android.content.Intent;
public class input extends Activity {
	Button done ; 
	RadioButton gFemale ; 
	RadioButton gMale;
	RadioButton Ayes ; 
	RadioButton Ano ;
	RadioButton Pyes;
	RadioButton Pno ; 
	RadioButton Cyes; 
	RadioButton Cno; 
	EditText Agetext ;
	EditText Weighttext ; 
	EditText Highttext;
	String gender1 = "Male" , athlete1="yes" , purge1 = "no" , constipation1 = "no" , age1 ="21" , weight1 ="60" , height1 = "178" ;
	
	@Override
	  public void onCreate(Bundle savedInstanceState)
	{
	        super.onCreate(savedInstanceState);
	        setContentView(R.layout.start);
	        done = (Button) findViewById(R.id.submit);
	         done.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View arg0) {
				    gFemale = (RadioButton) findViewById(R.id.gfemale);
			         gMale = (RadioButton) findViewById(R.id.gmale);
			         Ayes = (RadioButton) findViewById(R.id.athleteyes);
			         Ano = (RadioButton) findViewById(R.id.athleteNo);
			         Pyes = (RadioButton) findViewById(R.id.purgeyes);
			         Pno = (RadioButton) findViewById(R.id.purgeNo);
			         Cyes = (RadioButton) findViewById(R.id.constipationYes);
			         Cno = (RadioButton) findViewById(R.id.constipationNo);
			         Agetext = (EditText) findViewById(R.id.Agetext);
			         Weighttext= (EditText)findViewById(R.id.weighttext);
			         Highttext = (EditText)findViewById(R.id.highttext);
			     
			         	age1 = Agetext.getText().toString();
			         	//Log.e("age1",age1);
			         	height1=Highttext.getText().toString();
						weight1 = Weighttext.getText().toString();
					
						if(gFemale.isSelected())
						{
							gender1="Female";
							gMale.setEnabled(false);
						}
						if(gMale.isSelected())
						{
							gender1="Male";
							gFemale.setEnabled(false);
						}
						
						if(Ayes.isSelected())
						{
							athlete1="yes";
							Ano.setEnabled(false);
						}
						if(Ano.isSelected())
						{
							athlete1="no";
							Ayes.setEnabled(false);
						}
						if(Pyes.isSelected())
						{
							purge1="yes";
							Pno.setEnabled(false);
						}
						if(Pno.isSelected())
						{
							purge1="no";
							Pyes.setEnabled(false);
						}
						if(Cyes.isSelected())
						{
							constipation1="yes";
							Cno.setEnabled(false);
						}
						if(Cno.isSelected())
						{
							constipation1="no";
							Cyes.setEnabled(false);
						}
					Intent i = new Intent();
					i.putExtra("age",age1 );
					i.putExtra("gender", gender1);
					i.putExtra("height", height1);
					i.putExtra("weight", weight1);
					i.putExtra("purge", purge1);
					i.putExtra("constipation", constipation1);
					i.putExtra("athlete", athlete1);
					setResult(100,i);
					finish();
				}
			});
	}
	
}