package com.nimeshfassignment;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class DashboardActivity extends AppCompatActivity {

    Button btnarea,btnpalindrome,btnreverse,btnswap;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        btnarea=findViewById(R.id.btnarea);
        btnpalindrome=findViewById(R.id.btnpalindrone);
        btnreverse=findViewById(R.id.btnreverse);
        btnswap=findViewById(R.id.btnswap);

        btnarea.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(DashboardActivity.this,MainActivity.class);
                startActivity(intent);
            }
        });

        btnpalindrome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(DashboardActivity.this,PalindromeActivity.class);
                startActivity(intent);
            }
        });

        btnreverse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(DashboardActivity.this,ReverseActivity.class);
                startActivity(intent);
            }
        });
        btnswap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(DashboardActivity.this,SwapActivity.class);
                startActivity(intent);
            }
        });

    }
}
