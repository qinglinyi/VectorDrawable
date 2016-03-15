package com.qinglinyi.vectordrawable;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.toVectorDrawable:
                startActivity(new Intent(this, VectorDrawableActivity.class));
                break;
            case R.id.toAnimatedVectorDrawable:
                startActivity(new Intent(this, ActivityAnimatedVectorDrawable.class));
                break;
            default:

                break;
        }
    }
}
