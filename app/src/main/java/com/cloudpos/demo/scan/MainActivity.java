package com.cloudpos.demo.scan;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.util.Log;
import android.view.WindowManager;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private TextView message;
    private EditText scanText;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.getWindow().setType(WindowManager.LayoutParams.TYPE_KEYGUARD_DIALOG);
        setContentView(R.layout.activity_main);
        message = findViewById(R.id.message);
        scanText = findViewById(R.id.scanText);
        scanText.requestFocus();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.e("ACTIVITY", "ACTIVITY DESTROYED! ");
    }

}