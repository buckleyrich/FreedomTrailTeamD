package com.bentleyCS460.freedomtraillite;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageButton;

public class MenuActivity extends Activity implements OnClickListener {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_menu);
		// Set up listeners for all the buttons
        ImageButton mapLaunchButton = (ImageButton)findViewById(R.id.imgBtnMapIcon);
        mapLaunchButton.setOnClickListener(this);
        
        /*Button newButton = (Button)findViewById(R.id.second_button);
        newButton.setOnClickListener(this);
        Button aboutButton = (Button)findViewById(R.id.third_button);
        aboutButton.setOnClickListener(this);
        Button exitButton = (Button)findViewById(R.id.exit_button);
        exitButton.setOnClickListener(this);
        */
    }
    
    public void onClick(View v) {
        switch (v.getId()) { 
        case R.id.imgBtnMapIcon:
        	Intent i1 = new Intent(this, MapOverview.class);
            startActivity(i1);
           break;
      
        /*case R.id.second_button:
        	Intent i2 = new Intent(this, SpinnerDemo.class);
            startActivity(i2);
           break;
       
        case R.id.third_button:
        	Intent i3 = new Intent(this, GridDemo.class);
            startActivity(i3);
           break;
        case R.id.exit_button:
           finish();
           break;*/
        }
     }

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.menu, menu);
		return true;
	}

}
