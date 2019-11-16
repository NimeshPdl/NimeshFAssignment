package com.nimeshfassignment;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class SwapActivity extends AppCompatActivity {

    Button btnswap;
    EditText etfirst;
    EditText etsecond;
    TextView tvfirst,tvsecond;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_swap);

        btnswap=findViewById(R.id.btnswap);
        etfirst=findViewById(R.id.etfirst);
        etsecond=findViewById(R.id.etsecond);
        tvfirst=findViewById(R.id.tvfirst);
        tvsecond=findViewById(R.id.tvsecond);


        btnswap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                SwapClass swapClass=new SwapClass();
                swapClass.setX(Integer.parseInt(etfirst.getText().toString()));
                swapClass.setY(Integer.parseInt(etsecond.getText().toString()));
                tvsecond.setText("Before Swap:" +"X="+Integer.parseInt(etfirst.getText().toString())+"Y="+Integer.parseInt(etsecond.getText().toString()));
                tvfirst.setText(swapClass.swapnumber());
            }
        });}}

