package com.example.administrator.broadcasttest;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends BaseActivity {

    private EditText account;
    private Button button;
    private EditText password;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        account = (EditText) findViewById(R.id.account);
        button = (Button) findViewById(R.id.login);
        password = (EditText) findViewById(R.id.password);

button.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        String acc = account.getText().toString();
        String pas = password.getText().toString();
        if(acc.equals("xuyaqin")&&pas.equals("zhangyongjun")){
            Intent intent = new Intent(MainActivity.this,LoginActivity.class);
            startActivity(intent);


        }else {
            Toast.makeText(MainActivity.this,"account or password error",Toast.LENGTH_SHORT).show();

        }
    }
});



    }






}
