# VectorDrawable

Support Vector Drawables and Animated Vector Drawables Demo

这是一个使用Support v7完成Vector Drawable和Animated Vector Drawable的Demo。


# 添加支持

  使用Gradle Plugin 1.5：
  
  ```
  classpath 'com.android.tools.build:gradle:1.5.0'
  ```
  
  ```
    // Gradle Plugin 1.5  
    android {  
      defaultConfig {  
       generatedDensities = []  
     }  
  
     // This is handled for you by the 2.0+ Gradle Plugin  
     aaptOptions {  
      additionalParameters "--no-version-vectors"  
     }  
    }
    
  ```


# Vector Drawables

1. ImageView（及其子类：ImageButton、FloatingActionButton） 使用

   * 在布局文件中使用的话 使用app:srcCompat代替android:src
   
   ```
   <ImageView
           android:layout_width="wrap_content"
           android:layout_height="wrap_content"
           app:srcCompat="@drawable/android_green_ic"/>
   ```
   
   * 在代码中使用的话直接使用setImageResource,和以前没有区别
   
   ```
   ImageView mImageView = (ImageView) findViewById(R.id.image_view);
   mImageView.setImageResource(R.drawable.android_green_ic);
   ```
   
   

2. 其他地方，如果想在5.0以下使用的话，需要用其他Drawable容器包装以下

    `android_green_ic_wrap.xml`

    ```
    <?xml version="1.0" encoding="utf-8"?>
    <inset
        xmlns:android="http://schemas.android.com/apk/res/android"
        android:drawable="@drawable/android_green_ic"/>
    ```
    
    这个包装可以是StateListDrawable, InsetDrawable, LayerDrawable, LevelListDrawable, RotateDrawable
    
    包装之后就可以在其他不能直接使用的地方使用了：
    
    ```
    <TextView
            android:drawableLeft="@drawable/android_green_ic_wrap"
            android:text="@string/hello_world"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"/>
    ```
    
    或者
    
    ```
    TextView mTextView= (TextView) findViewById(R.id.text_view);
    mTextView.setBackgroundResource(R.drawable.android_green_ic_wrap);
    ```
    
3. 再来一个selector
    
    `android_selector.xml`
    
    ```
    <?xml version="1.0" encoding="utf-8"?>
    <selector xmlns:android="http://schemas.android.com/apk/res/android">
    
        <item android:state_checked="true"
              android:drawable="@drawable/android_red_ic" />
    
        <item android:drawable="@drawable/android_green_ic" />
    </selector>
    ```
    ```
     <CheckBox
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:layout_marginTop="20dp"
            android:background="@null"
            android:button="@drawable/android_selector"/>
    ```
    ![图片](/vd_checkbox.gif)