package com.example.colors;

import com.example.colors.R.color;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;

public class ChooseColorActivity extends Activity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_choose_color);
		
	}
	public void goToSo(View view){
		Intent myIntent = new Intent(this, ColorSelectionActivity.class);
		startActivityForResult(myIntent, 0);
	}

	@Override
	protected void onActivityResult(int requestCode, int resultCode, Intent data) {
		// TODO Auto-generated method stub
		super.onActivityResult(requestCode, resultCode, data);
		
		int temp=data.getExtras().getInt("name");
		if(temp==1)
			{
			FrameLayout fr=(FrameLayout)findViewById(R.id.frame1);
			fr.setBackgroundColor(getResources().getColor(R.color.red));
			}
		else if(temp==2)
		{
		FrameLayout fr=(FrameLayout)findViewById(R.id.frame1);
		fr.setBackgroundColor(getResources().getColor(R.color.blue));
		}
		else if(temp==3)
		{
		FrameLayout fr=(FrameLayout)findViewById(R.id.frame1);
		fr.setBackgroundColor(getResources().getColor(R.color.green));
		}
		else if(temp==4)
		{
		FrameLayout fr=(FrameLayout)findViewById(R.id.frame1);
		fr.setBackgroundColor(getResources().getColor(R.color.brown));
		}
		else if(temp==5)
		{
		FrameLayout fr=(FrameLayout)findViewById(R.id.frame1);
		fr.setBackgroundColor(getResources().getColor(R.color.yellow));
		}
		/*setContentView(R.layout.activity_choose_color);
		String clr=getResources().getcolor(R.color.);*/
		//fr.setBackgroundColor(Color.parseColor(temp));
	}
	

}
