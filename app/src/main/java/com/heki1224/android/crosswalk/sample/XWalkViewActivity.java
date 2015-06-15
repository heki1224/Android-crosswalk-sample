package com.heki1224.android.crosswalk.sample;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import org.xwalk.core.XWalkView;

/**
 * Created by heki on 15/06/15.
 */
public class XWalkViewActivity extends AppCompatActivity {
    public static final String KEY_URL = "url";
    private XWalkView mXWalkView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_x_walk_view);
        mXWalkView = (XWalkView) findViewById(R.id.activity_x_walk_view);
        mXWalkView.load(getIntent().getStringExtra(KEY_URL), null);
    }
}
