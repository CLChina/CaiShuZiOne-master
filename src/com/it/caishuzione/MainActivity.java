package com.it.caishuzione;

import java.util.Random;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends Activity {
	 int rand;

	public void startgame(View view) {
		EditText heng1 = (EditText) findViewById(R.id.z_9);
		EditText heng2 = (EditText) findViewById(R.id.z_8);
		int Heng1 = Integer.parseInt(heng1.getText().toString());
		int Heng2 = Integer.parseInt(heng2.getText().toString());
		if (Heng1>=Heng2){
			Toast.makeText(this, "�ڶ������ֱ�����ڵ�һ������", Toast.LENGTH_LONG).show();
		}else{
			rand = new Random().nextInt(Heng2 - Heng1) + Heng1;
			System.out.println(rand);
		}
	}

	/**
	 * �û�����������Ŀ��������Ƚ�
	 */
	public void submit(View view) {
		EditText heng3 = (EditText) findViewById(R.id.heng_3);
		int Heng3 = Integer.parseInt(heng3.getText().toString());
		if (Heng3 == rand) {
			Toast.makeText(this, "��ϲ��¶��ˣ�", Toast.LENGTH_LONG).show();
		} else if (Heng3 > rand) {
			Toast.makeText(this, "�������̫����", Toast.LENGTH_LONG).show();
		} else {
			Toast.makeText(this, "�������̫С�ˣ�", Toast.LENGTH_LONG).show();
		}

	}

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
