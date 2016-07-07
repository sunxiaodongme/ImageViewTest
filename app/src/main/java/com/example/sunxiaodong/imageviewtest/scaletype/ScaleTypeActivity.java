package com.example.sunxiaodong.imageviewtest.scaletype;

import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.sunxiaodong.imageviewtest.R;

/**
 * Created by sunxiaodong on 16/7/7.
 */
public class ScaleTypeActivity extends AppCompatActivity {

    private static final int IMAGE_SIZE_PX = 900;

    private FrameLayout mContainer;
    private TextView mTextView;
    private ImageView mImageView;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mContainer = new FrameLayout(this);
        FrameLayout.LayoutParams params = new FrameLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT);
        mContainer.setLayoutParams(params);
        mContainer.setBackgroundColor(Color.parseColor("#000000"));
        setContentView(mContainer);
        initView();
    }

    private void initView() {
        mTextView = new TextView(this);
        FrameLayout.LayoutParams textParams = new FrameLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        textParams.gravity = Gravity.CENTER_HORIZONTAL;
        mTextView.setLayoutParams(textParams);
        mTextView.setTextSize(TypedValue.COMPLEX_UNIT_PX, 54);
        mTextView.setIncludeFontPadding(false);
        mTextView.setTextColor(Color.parseColor("#ffffff"));
        mTextView.setText("CENTER");

        mImageView = new ImageView(this);
        FrameLayout.LayoutParams params = new FrameLayout.LayoutParams(IMAGE_SIZE_PX, IMAGE_SIZE_PX);
        params.gravity = Gravity.CENTER;
        mImageView.setLayoutParams(params);
        mImageView.setScaleType(ImageView.ScaleType.CENTER);
        mImageView.setImageDrawable(getResources().getDrawable(R.mipmap.dog));

        mContainer.addView(mTextView);
        mContainer.addView(mImageView);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.center:
                center();
                break;
            case R.id.center_crop:
                centerCrop();
                break;
            case R.id.center_inside:
                centerInside();
                break;
            case R.id.fit_center:
                fitCenter();
                break;
            case R.id.fit_end:
                fitEnd();
                break;
            case R.id.fit_start:
                fitStart();
                break;
            case R.id.fit_xy:
                fitXY();
                break;
            case R.id.matrix:
                matrix();
                break;

        }
        return super.onOptionsItemSelected(item);
    }

    private void center() {
        mImageView.setScaleType(ImageView.ScaleType.CENTER);
        mTextView.setText("CENTER");
    }

    private void centerCrop() {
        mImageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        mTextView.setText("CENTER_CROP");
    }

    private void centerInside() {
        mImageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        mTextView.setText("CENTER_INSIDE");
    }

    private void fitCenter() {
        mImageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        mTextView.setText("FIT_CENTER");
    }

    private void fitEnd() {
        mImageView.setScaleType(ImageView.ScaleType.FIT_END);
        mTextView.setText("FIT_END");
    }

    private void fitStart() {
        mImageView.setScaleType(ImageView.ScaleType.FIT_START);
        mTextView.setText("FIT_START");
    }

    private void fitXY() {
        mImageView.setScaleType(ImageView.ScaleType.FIT_XY);
        mTextView.setText("FIT_XY");
    }

    private void matrix() {
        mImageView.setScaleType(ImageView.ScaleType.MATRIX);
        mTextView.setText("MATRIX");
    }

}
