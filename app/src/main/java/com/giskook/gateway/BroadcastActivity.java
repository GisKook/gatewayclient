package com.giskook.gateway;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;
import com.giskook.gateway.HomeOrNot;

/**
 * Created by z on 2016/1/28.
 */
public class BroadcastActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_broadcast);
        HomeOrNot homeornot = new HomeOrNot();
        String ipAddr = homeornot.DoText();
        if(ipAddr.isEmpty()){
            Toast.makeText(this.getApplicationContext(),"not at home", Toast.LENGTH_SHORT).show();
            startActivity(new Intent(this, LoginActivity.class));
        }else {
            Toast.makeText(this.getApplicationContext(),"at home", Toast.LENGTH_SHORT).show();
            startActivity(new Intent(this, MainActivity.class));
        }
        this.finish();
    }
}
