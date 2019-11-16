package com.nimeshfassignment;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class PalindromeActivity extends AppCompatActivity {

    private EditText enNumber;
    private Button btnCheck;
    private TextView tvResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_palindrome);
        enNumber = findViewById(R.id.enNumber);
        btnCheck = findViewById(R.id.btnCheck);
        tvResult = findViewById(R.id.tvResult);



        btnCheck.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
            if (TextUtils.isEmpty(enNumber.getText())) {
                enNumber.setError("Please enter any number");
                enNumber.requestFocus();
                return;
            } else

                btnCheck.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Palindrome palindrome = new Palindrome();
                        palindrome.setNumber(Integer.parseInt(enNumber.getText().toString()));

                        if (palindrome.checknumber()==Boolean.TRUE)
                        {
                            tvResult.setText("Is Palindrome");
                        }
                        else
                        {
                            tvResult.setText("Not Palindrome");
                        }




                    }
                });



            }
        });}}