package com.app.sampleproject.model.utils;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.widget.TextView;

/**
 * Created by Sunil on 26-11-2017.
 */

@SuppressLint("AppCompatCustomView")
public class CustomTextview extends TextView {
    public CustomTextview(Context context) {
        super(context);
        Typeface face=Typeface.createFromAsset(context.getAssets(), ConstantsKey.TEXT_FONT_STYLE_NAME);
        this.setTypeface(face);
    }

    public CustomTextview(Context context, AttributeSet attrs) {
        super(context, attrs);
        Typeface face=Typeface.createFromAsset(context.getAssets(), ConstantsKey.TEXT_FONT_STYLE_NAME);
        this.setTypeface(face);
    }

    public CustomTextview(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        Typeface face=Typeface.createFromAsset(context.getAssets(), ConstantsKey.TEXT_FONT_STYLE_NAME);
        this.setTypeface(face);
    }

    protected void onDraw (Canvas canvas) {
        super.onDraw(canvas);
    }

}