package com.dream.user;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

/**
 * Created  on 2018/7/17.
 *
 * @author CPing
 * Email yy_cping@163.com
 * edit androidStudio
 */
public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.button1).setOnClickListener(this);
        findViewById(R.id.button2).setOnClickListener(this);
        findViewById(R.id.button3).setOnClickListener(this);
        findViewById(R.id.button4).setOnClickListener(this);
        findViewById(R.id.button5).setOnClickListener(this);
        findViewById(R.id.button6).setOnClickListener(this);


    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.button1:
                LoadImageActivity.goLoadImageActivity(this,1);
                break;
            case R.id.button2:
                LoadImageActivity.goLoadImageActivity(this,2);
                break;
            case R.id.button3:
                LoadImageActivity.goLoadImageActivity(this,3);
                break;
            case R.id.button4:
                LoadImageActivity.goLoadImageActivity(this,4);
                break;
            case R.id.button5:
                LoadImageActivity.goLoadImageActivity(this,5);
                break;
            default:
                LoadImageActivity.goLoadImageActivity(this,-1);
                break;

        }

    }
}
