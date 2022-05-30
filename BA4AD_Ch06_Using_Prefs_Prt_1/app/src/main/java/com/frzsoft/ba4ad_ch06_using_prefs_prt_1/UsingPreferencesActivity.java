package com.frzsoft.ba4ad_ch06_using_prefs_prt_1;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.content.Intent;
import android.view.View;

public class UsingPreferencesActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.using_preferences_activity);
	}
	
	public void onClickLoad(View paramView){
		Intent myIntent = new Intent("com.frzsoft.ba4ad_ch06_using_prefs_prt_1.AppPreferenceActivity");
		startActivity(myIntent);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.using_preferences_activity, menu);
		return true;
	}

}
