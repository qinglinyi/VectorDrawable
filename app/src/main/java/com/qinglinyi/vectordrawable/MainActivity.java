package com.qinglinyi.vectordrawable;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // 1.ImageView（及其子类） 使用

        // 1）在布局文件中使用的话 使用app:srcCompat代替android:src


        // 2）在代码中使用的话直接使用setImageResource,和以前没有区别
        ImageView mImageView = (ImageView) findViewById(R.id.image_view);
        mImageView.setImageResource(R.drawable.android_green_ic);

        // 2. 其他地方，如果想在5.0以下使用的话，需要用其他Drawable容器包装以下
        // （StateListDrawable, InsetDrawable, LayerDrawable, LevelListDrawable, and RotateDrawable）
    }
}
