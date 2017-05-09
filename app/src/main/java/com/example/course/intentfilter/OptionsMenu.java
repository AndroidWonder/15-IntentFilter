package com.example.course.intentfilter;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;
import android.content.Intent;
import android.net.Uri;

public class OptionsMenu extends Activity {
    
	private ImageView ImView;
	
	final int PICK1 = Menu.FIRST + 1;
	final int PICK2 = Menu.FIRST + 2;
	final int PICK3 = Menu.FIRST + 3;
	final int PICK4 = Menu.FIRST + 4;
	
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main2);
        
        ImView = (ImageView)findViewById(R.id.image);
        ImView.setImageResource(R.drawable.trek);
    }
    
    @Override
	public boolean onCreateOptionsMenu(Menu menu) {	
		super.onCreateOptionsMenu(menu);
		
		MenuItem item1 = menu.add(0, PICK1, Menu.NONE, "DIAL");
		MenuItem item2 = menu.add(0, PICK2, Menu.NONE, "WEB");
		MenuItem item3 = menu.add(0, PICK3, Menu.NONE, "Context Menu");
		MenuItem item4 = menu.add(0, PICK4, Menu.NONE, "Exit");
		item1.setShortcut('1', 'd');
		item2.setShortcut('2', 'w');
		item3.setShortcut('3', 'n');
		item4.setShortcut('4', 'e');
		
		return true;
	}//onCreateOptionsMenu
    
    @Override
	public boolean onOptionsItemSelected(MenuItem item) {		
		    
		    
		    //switch(ing). in this example IDs are: PICK1,...,PICK4 
		    int itemID = item.getItemId();
		    
		    switch (itemID) {
		    case PICK1 : 
		    	
		    	Uri uri1 = Uri.parse("tel:8005551212");
		    	Intent intent1 = new Intent(Intent.ACTION_VIEW, uri1);
		    	startActivity(intent1);
		    	return true; 
		    	
		    case PICK2 : 
		    	Uri uri2 = Uri.parse("http://www.mtv.com");
		    	Intent intent2 = new Intent(Intent.ACTION_VIEW, uri2);
		    	startActivity(intent2);
		    	return true;
		    	
		    case PICK3 : 
		    	Intent intent3 = new Intent(this, Contextmenu.class);
		    	startActivity(intent3);
		    	return true;
		    
		    case PICK4 : finish();
		    
		    default: super.onOptionsItemSelected(item);
		    }
		   	   
		    return false;
	    
	}//onOptionsItemSelected
}