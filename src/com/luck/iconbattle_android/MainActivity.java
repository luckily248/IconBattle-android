package com.luck.iconbattle_android;

import android.os.Bundle;

import com.badlogic.gdx.backends.android.AndroidApplication;
import com.luck.iconbattle.IconBattle;

public class MainActivity extends AndroidApplication {

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		initialize(new IconBattle(), false);
	}

}
