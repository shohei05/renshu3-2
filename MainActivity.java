package com.example.renshu3_2;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity{
	TextView mText1;
	EditText mEdit1;
	Button mButton1;
	
	public void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		setContentView(R.layout.fragment_main);
		mText1 = (TextView)findViewById(R.id.textView4);
		mEdit1 = (EditText)findViewById(R.id.editText1);
		mButton1 = (Button)findViewById(R.id.button1);
		
		mButton1.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View v) {
				String strX = mEdit1.getText().toString();
				int loop = Integer.parseInt(strX);
				String str = "";
				for (int i = 1; i <= loop; i ++){
					
					if ((i % 3) == 0 && (i % 5) == 0){
						str = str + "FizzBuzz ";
					}
					else if ((i % 3) == 0){
						str = str + "Fizz ";
					}
					else if ((i % 5) == 0){
						str = str + "Buzz ";
					}
					else{
						str = str + i + " ";
					}
					mText1.setText(str);
				}
			}
		});
	}
}
