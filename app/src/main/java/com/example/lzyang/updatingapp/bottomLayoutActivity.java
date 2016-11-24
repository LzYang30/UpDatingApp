package com.example.lzyang.updatingapp;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TabHost;


public class bottomLayoutActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bottom_layout);

        TabHost host = (TabHost)findViewById(R.id.activity_bottom_layout);
        host.setup();

        //Tab 1
        TabHost.TabSpec spec = host.newTabSpec("Tab One");
        spec.setContent(R.id.content_main);
        spec.setIndicator("Tab One");
        host.addTab(spec);
    }



}
