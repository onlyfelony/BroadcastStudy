package com.example.administrator.broadcasttest;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class LoginActivity extends BaseActivity {
     private Button bro;
    private BroadcastReceive broadcastReceive;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        bro = (Button) findViewById(R.id.bro);
        bro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent("force");
                sendBroadcast(intent);





            }
        });


    }
}
