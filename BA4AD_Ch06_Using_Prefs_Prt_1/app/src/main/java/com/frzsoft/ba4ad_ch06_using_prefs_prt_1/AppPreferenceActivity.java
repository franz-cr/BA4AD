package com.frzsoft.ba4ad_ch06_using_prefs_prt_1;

import android.os.Bundle;
import android.preference.PreferenceActivity;

public class AppPreferenceActivity extends PreferenceActivity {
	@SuppressWarnings("deprecation")
	@Override
	public void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		// Llama las preferencias desde el archivo xml creado anteriormente
		addPreferencesFromResource(R.xml.my_app_preferences);
	}

}
