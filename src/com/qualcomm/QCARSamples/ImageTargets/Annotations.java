package com.qualcomm.QCARSamples.ImageTargets;

import wazzatimagescanner.WLAuthenticate;
import wazzatimagescanner.WLAuthenticateListener;
import wazzatimagescanner.WLClientAcitivityInfo;
import wazzatimagescanner.WLImageScanner;
import android.app.Activity;
import android.hardware.Camera;
import android.os.Bundle;
import android.widget.ProgressBar;

public class Annotations extends Activity implements WLAuthenticateListener{

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_annotations);
		
		WLClientAcitivityInfo.setContext(this);
		WLAuthenticate.Authenticate("a5b6bd09f915080ea998" );
		
	}
	
	@Override
	public ProgressBar getProgressBar() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public void onAuthenticationDone() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void whileAuthenticating() {
		// TODO Auto-generated method stub	
	}
	/*
	public void onPictureTaken(byte[] data, Camera camera) {            
		// Pass the data from the picture to the SDK.
		String scanResult = "";
        
		// getFrameWidth returns the width of the preview frame.
		// getFrameHeight returns the height of the preview frame.        
		scanResult = WLImageScanner.scan(getFrameWidth(), getFrameHeight(), data );	  
	}
	*/
	
	
}
