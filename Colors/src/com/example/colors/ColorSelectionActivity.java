package com.example.colors;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class ColorSelectionActivity extends Activity {

	private RadioButton sele;
	private String temp;
	Context mcontext = this;
	@Override
	public void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		final Intent intent = getIntent();
		//Log.d("2nd activity", "dfdsf");
		setContentView(R.layout.listcolor);
		Button button=(Button)findViewById(R.id.Display);
		button.setOnClickListener(new View.OnClickListener() {
			 
			@Override
			public void onClick(View v) {
				RadioGroup g = (RadioGroup) findViewById(R.id.radioGroup);
				switch (g.getCheckedRadioButtonId())
				{
				case R.id.rb1:
					sele=(RadioButton) findViewById(g.getCheckedRadioButtonId());
					temp=(sele.getText()).toString();
				
					intent.putExtra("name",1);
					setResult(0, intent);
					finish();
					break;

				case R.id.rb2:
					sele=(RadioButton) findViewById(g.getCheckedRadioButtonId());
					temp=(sele.getText()).toString();
				
					intent.putExtra("name",2);
					setResult(0, intent);
					finish();
					break;
				case R.id.rb3:
					sele=(RadioButton) findViewById(g.getCheckedRadioButtonId());
					temp=(sele.getText()).toString();
				
					intent.putExtra("name",3);
					setResult(0, intent);
					finish();
					break;
				case R.id.rb4:
					sele=(RadioButton) findViewById(g.getCheckedRadioButtonId());
					temp=(sele.getText()).toString();
				
					intent.putExtra("name",4);
					setResult(0, intent);
					finish();
					break;
					//do something
				case R.id.rb5:
					sele=(RadioButton) findViewById(g.getCheckedRadioButtonId());
					temp=(sele.getText()).toString();
				
					intent.putExtra("name",5);
					setResult(0, intent);
					finish();
					break;
				}
			}
		});
	}
}
