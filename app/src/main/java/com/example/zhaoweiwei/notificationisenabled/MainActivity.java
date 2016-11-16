package com.example.zhaoweiwei.notificationisenabled;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

	private Button buttonNotify;
	private TextView textView;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		textView = (TextView) findViewById(R.id.textview);
		buttonNotify = (Button) findViewById(R.id.button_notify);
		buttonNotify.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				boolean isEnable = NotificationsUtils.isNotificationEnabled(MainActivity.this);
				if (isEnable) {
					textView.setText("通知可用！！！");
				} else {
					textView.setText("通知不可用！！！");
					textView.setTextColor(Color.parseColor("#ff0011"));
				}
			}
		});
	}
}
