package com.example.wuziqi_module.human;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import com.example.wuziqi_module.R;

public class FiveChessHumanActivity extends Activity {

	public static void startActivity(Context context){
		Intent intent = new Intent();
		intent.setClass(context,FiveChessHumanActivity.class);
		context.startActivity(intent);
	}

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_fivechess_human);
	}
}
