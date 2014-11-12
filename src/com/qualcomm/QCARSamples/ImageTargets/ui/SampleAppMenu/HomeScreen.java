package com.qualcomm.QCARSamples.ImageTargets.ui.SampleAppMenu;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.qualcomm.QCARSamples.ImageTargets.ActivitySplashScreen;
import com.qualcomm.QCARSamples.ImageTargets.R;

public class HomeScreen extends Activity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.home);
	

		Button button = (Button) findViewById(R.id.button1);
		button.setOnClickListener(new View.OnClickListener() {
		    public void onClick(View v) {
		        // Do something in response to button click
		    	Intent lensApp = new Intent(v.getContext(), ActivitySplashScreen.class);
		    	//startActivityForResult(lensApp, 0);
		    	//Intent lensApp = new Intent(this, ActivitySplashScreen.class);
		        startActivity(lensApp);

		    }
		});
	}
	
}
