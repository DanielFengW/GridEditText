package com.daniel.gridedittext;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;

/**
 * Created by Administrator on 2016/7/26 0026.
 */
public class GridEditText extends FrameLayout {
    public GridEditText(Context context) {
         super(context);
        initView();
    }

    public GridEditText(Context context, AttributeSet attrs) {
        super(context, attrs);
        initView();
    }

    public GridEditText(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        initView();
    }

    private void initView() {
        addView(View.inflate(getContext(),R.layout.grid_edittext,null));
    }
}
