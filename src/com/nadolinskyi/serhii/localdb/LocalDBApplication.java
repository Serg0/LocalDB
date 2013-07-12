package com.nadolinskyi.serhii.localdb;

import com.activeandroid.ActiveAndroid;

import android.app.Application;
import android.text.GetChars;
import android.util.Log;

public class LocalDBApplication extends Application {

	
	private final String LOG_TAG = getClass().getSimpleName();

	@Override
	public void onCreate() {
		super.onCreate();
		Log.d(LOG_TAG, "App created ...");
		ActiveAndroid.initialize(this);
	}
	
	
	
	@Override
	public void onTerminate() {
		super.onTerminate();
		Log.d(LOG_TAG, "App termintated ...");
		ActiveAndroid.dispose();
	}
}
