package com.example.picassosample;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class MainActivity extends Activity {
	
	ImageView imgUrlImage;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.fragment_main);
		
		imgUrlImage = (ImageView) findViewById(R.id.imgUrlImage);
		
		Picasso.with(MainActivity.this)
				.load("http://kevinpelgrims.com/blog/files/images/2012/05/android.png")
				.into(imgUrlImage);

	}

}
