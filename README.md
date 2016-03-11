# VectorDrawable
Support Vector Drawable Demo

这是一个使用Support v7完成VectorDrawable的Demo。


# AppCompatImageView

1. ImageView（及其子类） 使用

   * 在布局文件中使用的话 使用app:srcCompat代替android:src
   * 在代码中使用的话直接使用setImageResource,和以前没有区别

2. 其他地方，如果想在5.0以下使用的话，需要用其他Drawable容器包装以下