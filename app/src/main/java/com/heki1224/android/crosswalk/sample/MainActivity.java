package com.heki1224.android.crosswalk.sample;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button w1 = (Button) findViewById(R.id.w1);
        w1.setAllCaps(false);
        w1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, WebViewActivity.class);
                intent.putExtra(WebViewActivity.KEY_URL, "http://html5test.com");
                startActivity(intent);
            }
        });

        Button w2 = (Button) findViewById(R.id.w2);
        w2.setAllCaps(false);
        w2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, WebViewActivity.class);
                intent.putExtra(WebViewActivity.KEY_URL, "https://www.webkit.org/perf/sunspider-1.0.2/sunspider-1.0.2/driver.html");
                startActivity(intent);
            }
        });

        Button xw1 = (Button) findViewById(R.id.xw1);
        xw1.setAllCaps(false);
        xw1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, XWalkViewActivity.class);
                intent.putExtra(XWalkViewActivity.KEY_URL, "http://html5test.com");
                startActivity(intent);
            }
        });

        Button xw2 = (Button) findViewById(R.id.xw2);
        xw2.setAllCaps(false);
        xw2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, XWalkViewActivity.class);
                intent.putExtra(XWalkViewActivity.KEY_URL, "https://www.webkit.org/perf/sunspider-1.0.2/sunspider-1.0.2/driver.html");
                startActivity(intent);
            }
        });
    }
}
