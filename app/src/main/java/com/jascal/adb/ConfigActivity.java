package com.jascal.adb;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class ConfigActivity extends AppCompatActivity {

    private EditText mEditIPAddress, mEditPortNumber;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(com.infinitystudios.tcpip.R.layout.activity_config);

        mEditIPAddress = findViewById(com.infinitystudios.tcpip.R.id.editIPAddress);
        mEditPortNumber = findViewById(com.infinitystudios.tcpip.R.id.editPortNumber);
    }

    public void onNextClick(View view) {
        String ip = mEditIPAddress.getText().toString().trim();
        String port = mEditPortNumber.getText().toString().trim();
        if (ip.isEmpty() || port.isEmpty()) {
            Toast.makeText(getApplicationContext(), "Please fill in the ip address and port number", Toast.LENGTH_LONG).show();
            return;
        }
        ((App) getApplicationContext()).setValue("ip", ip);
        ((App) getApplicationContext()).setValue("port", port);
        startActivity(new Intent(this, MainActivity.class));
        finish();
    }
}
