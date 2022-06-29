package com.example.passaggiodatitraschermate;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class AnotherActivity4results extends AppCompatActivity {

    private EditText etResult = null;
    private Button bttok = null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_another_activity4results);

        etResult = findViewById(R.id.MessageResult);
        bttok = findViewById(R.id.bttOk);
        String mess = getIntent().getStringExtra(getString(R.string.LABEL_MEX));
        etResult.setText(mess);

        bttok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String text = etResult.getText().toString();
                Intent i = new Intent();
                i.putExtra(getString(R.string.LABEL_MEX_RETURN),text);

                setResult(Activity.RESULT_OK,i);
                finish();
            }
        });
    }
}