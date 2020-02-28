/*
 * This example demonstrates the use of an intent filter.
 * There are three activities. Two are started by clicking a button.
 * The first button doesn't specify a data type. The second does.
 * Be sure to look at the Manifest.
 */
package com.example.course.intentfilter;

import android.app.Activity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.net.Uri;

public class IntentFilter extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
      
        //click button to start activity 
        Button button = (Button)findViewById(R.id.button);
        button.setOnClickListener(
        		new OnClickListener(){
        			public void onClick(View v){
        				  Intent intent = new Intent("ACTION_CS480");
        			        startActivity(intent); 
        			}
        		});
        
      //click button to start activity with specified Uri
        Button otherbutton = (Button)findViewById(R.id.otherbutton);
        otherbutton.setOnClickListener(
        		new OnClickListener(){
        			public void onClick(View v){
        				Uri uri = Uri.parse("sms:123456");
        				  Intent intent = new Intent("ACTION_CS480", uri);
        			        startActivity(intent); 
        			}
        		});
      
    }
}