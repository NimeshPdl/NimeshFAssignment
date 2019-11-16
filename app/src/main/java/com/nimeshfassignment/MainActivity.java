package com.nimeshfassignment;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText enRadius;
    private Button btnCalculate;
    private TextView tvResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        enRadius = findViewById(R.id.enRadius);
        btnCalculate = findViewById(R.id.btnCalculate);
        tvResult = findViewById(R.id.tvResult);

        btnCalculate.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (TextUtils.isEmpty(enRadius.getText())) {
                    enRadius.setError("Please enter first no");
                    enRadius.requestFocus();
                    return;
                } else
                    btnCalculate.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            float number = (22 / 7);
                            float result;
                            float radius = Float.parseFloat(enRadius.getText().toString());

                            Circle circle = new Circle(radius, number);
                            result = circle.area();
                            tvResult.setText(Float.toString(result));
            }
        });
    }
});}}
