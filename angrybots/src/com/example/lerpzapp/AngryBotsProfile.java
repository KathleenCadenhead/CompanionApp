package com.example.lerpzapp;

import java.util.Locale;

import android.os.Build;
import android.os.Bundle;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Typeface;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.support.v4.app.NavUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;

public class AngryBotsProfile extends Activity {

	@SuppressLint("NewApi")
	@Override
	public void onCreate(Bundle savedInstanceState) {
	    super.onCreate(savedInstanceState);
	    setContentView(R.layout.activity_angrybots_profile);
	    
	    TableLayout table = new TableLayout(this);  
	    table.setStretchAllColumns(true);  
	    table.setShrinkAllColumns(true);  
	    TableRow rowTitle = new TableRow(this);  
	    rowTitle.setGravity(Gravity.CENTER_HORIZONTAL);
	    TableRow picture = new TableRow(this);
	    picture.setGravity(Gravity.RIGHT);
	    TableRow rowDayLabels = new TableRow(this);  
	    TableRow rowHighs = new TableRow(this);  
	    TableRow rowLows = new TableRow(this);  
	    TableRow rowConditions = new TableRow(this);  
	    rowConditions.setGravity(Gravity.CENTER);  
	    TextView empty = new TextView(this);  
	    
	    ImageView mainpic = new ImageView(this);
	    mainpic.setImageResource(R.drawable.leaderboardbuttonpressed);
	    picture.addView(mainpic);
	    
	    // title column/row  
	    TextView title = new TextView(this);  
	    title.setText("Angry Bots Profile");  
	    title.setTextSize(TypedValue.COMPLEX_UNIT_DIP, 50);  
	    title.setGravity(Gravity.CENTER);  
	    title.setTextColor(Color.LTGRAY);
	    title.setTypeface(Typeface.SERIF, Typeface.BOLD);  
	    TableRow.LayoutParams params = new TableRow.LayoutParams();  
	    params.span = 6;  
	    rowTitle.addView(title, params);  
	    
	    // labels column  
	    TextView highsLabel = new TextView(this);  
	    highsLabel.setText("Day High");
	    highsLabel.setTextColor(Color.LTGRAY);
	    highsLabel.setTypeface(Typeface.DEFAULT_BOLD);  
	    TextView lowsLabel = new TextView(this);  
	    lowsLabel.setText("Day Low");
	    lowsLabel.setTextColor(Color.LTGRAY);
	    lowsLabel.setTypeface(Typeface.DEFAULT_BOLD);  
	    TextView conditionsLabel = new TextView(this);  
	    conditionsLabel.setText("Conditions");  
	    conditionsLabel.setTextColor(Color.LTGRAY);
	    conditionsLabel.setTypeface(Typeface.DEFAULT_BOLD);  
	    rowDayLabels.addView(empty);  
	    rowHighs.addView(highsLabel);  
	    rowLows.addView(lowsLabel);  
	    rowConditions.addView(conditionsLabel);  
	    
	    // day 1 column  
	    TextView day1Label = new TextView(this);  
	    day1Label.setText("Feb 7");
	    day1Label.setTextColor(Color.LTGRAY);
	    day1Label.setTypeface(Typeface.SERIF, Typeface.BOLD);  
	    TextView day1High = new TextView(this);  
	    day1High.setText("28°F");  
	    day1High.setTextColor(Color.LTGRAY);
	    day1High.setGravity(Gravity.CENTER_HORIZONTAL);  
	    TextView day1Low = new TextView(this);  
	    day1Low.setText("15°F");
	    day1Low.setTextColor(Color.LTGRAY);
	    day1Low.setGravity(Gravity.CENTER_HORIZONTAL);  
	    ImageView day1Conditions = new ImageView(this);  
	    day1Conditions.setImageResource(R.drawable.leaderboardbuttonpressed);  
	    rowDayLabels.addView(day1Label);  
	    rowHighs.addView(day1High);  
	    rowLows.addView(day1Low);  
	    rowConditions.addView(day1Conditions);  
	    
	    // day2 column  
	    TextView day2Label = new TextView(this);  
	    day2Label.setText("Feb 8");
	    day2Label.setTextColor(Color.LTGRAY);
	    day2Label.setTypeface(Typeface.SERIF, Typeface.BOLD);  
	    TextView day2High = new TextView(this);  
	    day2High.setText("26°F"); 
	    day2High.setTextColor(Color.LTGRAY);
	    day2High.setGravity(Gravity.CENTER_HORIZONTAL);  
	    TextView day2Low = new TextView(this);  
	    day2Low.setText("14°F");
	    day2Low.setTextColor(Color.LTGRAY);
	    day2Low.setGravity(Gravity.CENTER_HORIZONTAL);  
	    ImageView day2Conditions = new ImageView(this);  
	    day2Conditions.setImageResource(R.drawable.leaderboardbuttonpressed);  
	    rowDayLabels.addView(day2Label);  
	    rowHighs.addView(day2High);  
	    rowLows.addView(day2Low);  
	    rowConditions.addView(day2Conditions);  
	    
	    // day3 column  
	    TextView day3Label = new TextView(this);  
	    day3Label.setText("Feb 9");
	    day3Label.setTextColor(Color.LTGRAY);
	    day3Label.setTypeface(Typeface.SERIF, Typeface.BOLD);  
	    TextView day3High = new TextView(this);  
	    day3High.setText("23°F"); 
	    day3High.setTextColor(Color.LTGRAY);
	    day3High.setGravity(Gravity.CENTER_HORIZONTAL);  
	    TextView day3Low = new TextView(this);  
	    day3Low.setText("3°F");  
	    day3Low.setTextColor(Color.LTGRAY);
	    day3Low.setGravity(Gravity.CENTER_HORIZONTAL);  
	    ImageView day3Conditions = new ImageView(this);  
	    day3Conditions.setImageResource(R.drawable.leaderboardbuttonpressed);  
	    rowDayLabels.addView(day3Label);  
	    rowHighs.addView(day3High);  
	    rowLows.addView(day3Low);  
	    rowConditions.addView(day3Conditions);  
	    
	    // day4 column  
	    TextView day4Label = new TextView(this);  
	    day4Label.setText("Feb 10"); 
	    day4Label.setTextColor(Color.LTGRAY);
	    day4Label.setTypeface(Typeface.SERIF, Typeface.BOLD);  
	    TextView day4High = new TextView(this);  
	    day4High.setText("17°F");  
	    day4High.setTextColor(Color.LTGRAY);
	    day4High.setGravity(Gravity.CENTER_HORIZONTAL);  
	    TextView day4Low = new TextView(this);  
	    day4Low.setText("5°F");  
	    day4Low.setTextColor(Color.LTGRAY);
	    day4Low.setGravity(Gravity.CENTER_HORIZONTAL);  
	    ImageView day4Conditions = new ImageView(this);  
	    day4Conditions.setImageResource(R.drawable.leaderboardbuttonpressed);  
	    rowDayLabels.addView(day4Label);  
	    rowHighs.addView(day4High);  
	    rowLows.addView(day4Low);  
	    rowConditions.addView(day4Conditions);  
	    
	    // day5 column  
	    TextView day5Label = new TextView(this);  
	    day5Label.setText("Feb 11");  
	    day5Label.setTextColor(Color.LTGRAY);
	    day5Label.setTypeface(Typeface.SERIF, Typeface.BOLD);  
	    TextView day5High = new TextView(this);  
	    day5High.setText("19°F");  
	    day5High.setTextColor(Color.LTGRAY);
	    day5High.setGravity(Gravity.CENTER_HORIZONTAL);  
	    TextView day5Low = new TextView(this);  
	    day5Low.setText("6°F");  
	    day5Low.setTextColor(Color.LTGRAY);
	    day5Low.setGravity(Gravity.CENTER_HORIZONTAL);  
	    ImageView day5Conditions = new ImageView(this);  
	    day5Conditions.setImageResource(R.drawable.leaderboardbuttonpressed);  
	    rowDayLabels.addView(day5Label);  
	    rowHighs.addView(day5High);  
	    rowLows.addView(day5Low);  
	    rowConditions.addView(day5Conditions);
	    table.addView(picture);
	    table.addView(rowTitle);  
	    table.addView(rowDayLabels);  
	    table.addView(rowHighs);  
	    table.addView(rowLows);  
	    table.addView(rowConditions); 
	    table.setBackground(getResources().getDrawable(R.drawable.backgroundimage));
	    setContentView(table);  

	    
	    
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_achievements, menu);
		return true;
	}
}

