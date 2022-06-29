package com.example.passaggiodatitraschermate;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private  final int ACTIVITY_REQUEST_CODE =1;
    private EditText etMessage = null;
    private Button bttStartActivity = null;
    private Button bttStartActivity4result = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etMessage = findViewById(R.id.etMessage);
        bttStartActivity =  findViewById(R.id.bttStartActivity);
        bttStartActivity4result = findViewById(R.id.bttStartActivityforResults);

        bttStartActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String text = etMessage.getText().toString();

                Intent intent = new Intent(getString(R.string.LAUNCH_ACTIVITY));
                intent.putExtra(getString(R.string.LABEL_MEX),text);
                startActivity(intent);
            }
        });

        bttStartActivity4result.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String text = etMessage.getText().toString();

                Intent intent = new Intent(getString(R.string.LAUNCH_ACTIVITY_4_RESULT));
                intent.putExtra(getString(R.string.LABEL_MEX),text);
                startActivityForResult(intent,ACTIVITY_REQUEST_CODE);

            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if(requestCode == ACTIVITY_REQUEST_CODE){
            if(resultCode == Activity.RESULT_OK){
                String s = data.getStringExtra(getString(R.string.LABEL_MEX_RETURN));
                etMessage.setText(s);
        }
        else{
            Log.i("TAG","Reques Code Error");
        }
    }else{
            Log.i("TAG","Reques Code Error"); }
    }
}