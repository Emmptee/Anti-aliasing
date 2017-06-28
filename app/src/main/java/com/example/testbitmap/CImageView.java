package com.example.testbitmap;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.widget.ImageView;

public class CImageView extends ImageView{

	Paint paint;
	Bitmap bitmap;
	Matrix matrix;
	public CImageView(Context context) {
		super(context);
		init();
	}
	
	public CImageView(Context context,AttributeSet attr) {
		super(context,attr);
		init();
	}
	
	private void init(){
		 paint = new Paint();
		 paint.setAntiAlias(true);
		 matrix = new Matrix();
		 matrix.setRotate(17);
	}
	
	@Override
	public void draw(Canvas canvas) {
	    if(null!=bitmap){
	    	canvas.translate(100, 50);
	    	canvas.drawBitmap(bitmap, matrix, paint);
	    }
	}
	
	@Override
	public void setImageBitmap(Bitmap bm) {
		bitmap = bm;
		super.setImageBitmap(bm);
	}
}