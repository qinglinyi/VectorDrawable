package com.qinglinyi.vectordrawable;

import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;

public class ActivityAnimatedVectorDrawable extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animated_vector_drawable);
        ImageView imageView= (ImageView) findViewById(R.id.image_view);
        assert imageView != null;
        Drawable drawable = imageView.getDrawable();
        if (drawable instanceof Animatable){
            ((Animatable) drawable).stop();
            ((Animatable) drawable).start();
        }
    }
}
