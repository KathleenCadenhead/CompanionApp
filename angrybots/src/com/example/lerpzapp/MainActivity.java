package com.example.lerpzapp;

import java.io.IOException;
import java.sql.SQLException;

import org.json.simple.parser.ParseException;

import Messaging.Client;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;

public class MainActivity extends Activity {
	
	public final static String EXTRA_MESSAGE = "com.example.myfirstapp.MESSAGE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
       /* try {
			Client c = new Client("129.62.151.75");
			if(c.login("testme1@test.com","12345678")){
				
				
			}
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.activity_main, menu);
        return true;
    }
    
    /** Called when the user clicks the Lerpz Profile button */
    public void angrybotsProfile(View view) {
       
    	Intent intent = new Intent(this, AngryBotsProfile.class);
    	
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
    
    public void map(View view){
    	
        Intent intent = new Intent(this, Map.class);
    	
    	startActivity(intent);
    	
    }
    
   public void server(View view){
    	
        Intent intent = new Intent(this, Server.class);
    	
    	startActivity(intent);
    	
    }
   
   public void settings(View view){
   	
       Intent intent = new Intent(this, Settings.class);
   	
   	startActivity(intent);
   	
   }
   
   public void minigame(View view){
	   	
       Intent intent = new Intent(this, MiniGame.class);
   	
   	startActivity(intent);
   	
   }
    
    
    
}