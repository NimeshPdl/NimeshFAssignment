package com.nimeshfassignment;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class ReverseActivity extends AppCompatActivity {

     EditText enNumber;
     Button btnReverse;
     TextView tvResult;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reverse);

        btnReverse=findViewById(R.id.btnReverse);
        tvResult=findViewById(R.id.tvResult);
        enNumber=findViewById(R.id.enNumber);


        btnReverse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ReverseClass reverseClass = new ReverseClass();
                reverseClass.setN(Integer.parseInt(enNumber.getText().toString()));

                tvResult.setText(Integer.toString(reverseClass.reversenumber()));

            }
        });
    }
}