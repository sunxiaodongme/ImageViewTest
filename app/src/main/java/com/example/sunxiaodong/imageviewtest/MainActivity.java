package com.example.sunxiaodong.imageviewtest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.sunxiaodong.imageviewtest.scaletype.ScaleTypeActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button mScaleType;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    private void initView() {
        mScaleType = (Button) findViewById(R.id.go_scale_type);
        mScaleType.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.go_scale_type: {
                goScaleType();
            }
            break;
        }
    }

    private void goScaleType() {
        Intent intent = new Intent(this, ScaleTypeActivity.class);
        startActivity(intent);
    }

}
