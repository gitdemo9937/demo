package com.example.newprojecttest;

import android.support.v7.app.ActionBarActivity;
import android.util.Log;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class GameActivity extends ActionBarActivity {

	String word="MWORD";
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_game);
	}

	
	public void introduceLetter(View v)
	
	{
		EditText myedit=(EditText) findViewById(R.id.edittext);
		String letter=myedit.getText().toString();
		Log.d("mylog","The letter is"+letter);
		if(letter.length()==1)
		{
			
		}
		else
		{
			Toast.makeText(this,"introuce letter",Toast.LENGTH_SHORT).show();
			}
	}
	
	public void checkLetter(String introducedLetter)
	{
		char charIntro = introducedLetter.charAt(0);
		for(int i=0;i<word.length();i++)
		
		 {
			char fromTheWord=word.charAt(i);
			
			Log.d("mylog","the letter we're checking is "+word.charAt(i));
			if(charIntro==fromTheWord)
			{
				Log.d("mylog","there is a match");
				showGuessed(i,charIntro);
			}
		}
	}
	
	
	public void showGuessed(int ind,char guessLetter)
	{
		LinearLayout lin=(LinearLayout) findViewById(R.id.layoutLetters);
		TextView textview = (TextView) lin.getChildAt(ind);
		textview.setText(Character.toString(guessLetter));
		
	}
	}


