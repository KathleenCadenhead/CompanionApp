package com.example.lerpzapp;

import java.util.Locale;

import android.os.Build;
import android.os.Bundle;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.support.v4.app.NavUtils;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;

public class LerpzProfile extends Activity {

	@SuppressLint("NewApi")
	@Override
	public void onCreate(Bundle savedInstanceState) {
	    super.onCreate(savedInstanceState);
	    setContentView(R.layout.activity_lerpz_profile);

	    // Get the message from the intent
	    Intent intent = getIntent();

	    // Create the text view
	    /*String message = "Lerpz Profile\r\n\r\nYour Name Here";

	    // Create the text view
	    TextView textView = new TextView(this);
	    textView.setTextSize(40);
	    //textView.setText(message);
	    textView.setTextColor(Color.LTGRAY);
	    //textView.setGravity(0x00000011);
	    textView.setBackgroundResource(R.drawable.myprofilescreenapp);*/
	    

	    // Set the text view as the activity layout
	    //setContentView(textView);
	    
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_achievements, menu);
		return true;
	}
}

