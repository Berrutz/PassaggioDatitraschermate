package com.example.passaggiodatitraschermate;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class AnotherActivity extends AppCompatActivity {

    private TextView tvmessageReceiver=null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_another);

        tvmessageReceiver = findViewById(R.id.tvtext);
        Intent intent = getIntent();
        String mex = intent.getStringExtra(getString(R.string.LABEL_MEX));
        tvmessageReceiver.setText(mex);

    }
}