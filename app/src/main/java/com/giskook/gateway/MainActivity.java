package com.giskook.gateway;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends Activity {

    private TextView tvShow;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        intView();
    }

    private void intView() {
        tvShow= (TextView) findViewById(R.id.tvShow);
        tvShow.setText("dfasdfas");
    }
}
