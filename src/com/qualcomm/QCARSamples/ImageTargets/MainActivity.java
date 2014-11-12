package com.qualcomm.QCARSamples.ImageTargets;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}

	public void start_restoring_lens_activity(View view) {
		Intent i = new Intent(MainActivity.this,ActivitySplashScreen.class);
		startActivity(i);
	}
	
	public void start_annotations_activity(View view) {
		Intent i = new Intent(MainActivity.this,Annotations.class);
		startActivity(i);
	}
	
	public void start_3D_restore_activity(View view) {
		//Intent i = new Intent(MainActivity.this,<Insert class name here>.class);
		//startActivity(i);
	}

}
