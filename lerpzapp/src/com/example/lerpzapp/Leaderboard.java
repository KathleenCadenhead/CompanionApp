package com.example.lerpzapp;

import android.os.Bundle;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.view.Menu;
import android.view.View;
import android.widget.TextView;

public class Leaderboard extends Activity {

	@SuppressLint("NewApi")
	@Override
	public void onCreate(Bundle savedInstanceState) {
	    super.onCreate(savedInstanceState);
	    setContentView(R.layout.activity_leaderboard);

	    // Get the message from the intent
	    Intent intent = getIntent();
	    

	    // Create the text view
	    //TextView textView = new TextView(this);
	    //textView.setTextSize(40);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_achievements, menu);
		return true;
	}
}

