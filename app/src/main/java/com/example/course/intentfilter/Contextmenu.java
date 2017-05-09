package com.example.course.intentfilter;

import android.app.Activity;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ContextMenu.ContextMenuInfo;
import android.widget.ImageView;

public class Contextmenu extends Activity {

	private ImageView ImView;
	
	final int PICK1 = Menu.FIRST + 1;
	final int PICK2 = Menu.FIRST + 2;
	final int PICK3 = Menu.FIRST + 3;
	final int PICK4 = Menu.FIRST + 4;
		
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main3);
        
        ImView = (ImageView)findViewById(R.id.image);
        ImView.setImageResource(R.drawable.trek);
        
        registerForContextMenu(ImView);
    }
    
    @Override
	public void onCreateContextMenu(ContextMenu menu, View v,
			ContextMenuInfo menuInfo) {		
		super.onCreateContextMenu(menu, v, menuInfo);
		//add a couple of options to the context menu
		menu.setHeaderTitle("Select Special Action");
		menu.add(0, PICK1, Menu.NONE, "Option-1 ONE special");
		menu.add(0, PICK2, Menu.NONE, "Option-2 TWO special");
	}//onCreateContextMenu	

	
	@Override
	public boolean onContextItemSelected(MenuItem item) {
		super.onContextItemSelected(item);
		//insert something
		return false;
	}//onContextItemSelected
}