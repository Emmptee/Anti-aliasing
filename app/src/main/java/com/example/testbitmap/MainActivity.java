package com.example.testbitmap;


import android.annotation.SuppressLint;
import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;

public class MainActivity extends Activity {
	LinearLayout main;
	ImageView imageView;
	Bitmap bitmap;
    @SuppressLint("NewApi")
	@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        main = (LinearLayout)findViewById(R.id.main);
        bitmap = BitmapFactory.decodeResource(getResources(), R.drawable.pic1);
        CImageView img = new CImageView(this);
        img.setImageBitmap(bitmap);
        main.addView(img,new LinearLayout.LayoutParams(500,500));
    }
    
    
}
