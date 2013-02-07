package com.example.lerpzapp;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends Activity {
	
	public final static String EXTRA_MESSAGE = "com.example.myfirstapp.MESSAGE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.activity_main, menu);
        return true;
    }
    
    /** Called when the user clicks the Lerpz Profile button */
    public void lerpzProfile(View view) {
       
    	Intent intent = new Intent(this, LerpzProfile.class);
    	
    	startActivity(intent);
    	
    }
    
    /** Called when the user clicks the leaderboard button */
    public void leaderboard(View view) {
       
    	Intent intent = new Intent(this, Leaderboard.class);
    	
    	startActivity(intent);
    	
    	
    }
    
    /** Called when the user clicks the achievements button */
    public void achievements(View view) {
       
    	Intent intent = new Intent(this, Achievements.class);
    	
    	startActivity(intent);
    	
    	
    }
    
}
