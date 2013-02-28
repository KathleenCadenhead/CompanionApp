package com.example.lerpzapp;

import java.util.Random;

import android.os.Bundle;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class MiniGame extends Activity {
	
	public final static String EXTRA_MESSAGE = "com.example.myfirstapp.MESSAGE";
	
	Integer points =0;

	@SuppressLint("NewApi")
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_mini_game);
		
		final Button button = (Button)findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
            	points+=1;
        		
        		String print = "Points: "+points.toString();
        		
        		//Creating TextView Variable
                TextView text = (TextView) findViewById(R.id.tv);
               
                //Sets the new text to TextView (runtime click event)
                text.setText(print);
                
                Random r =new Random();
                
                float x = r.nextInt(200);
                float y = r.nextInt(200);
                
                if(y<150)
                	y+=100;
                
                
                button.setX(x);
                button.setY(y);
            }
        });
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_mini_game, menu);
		return true;
	}

}
