package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private EditText etNumber1, etNumber2;
    private Button btnAdd, btnSubtract, btnMultiply, btnDivide;
    private TextView tvResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etNumber1 = findViewById(R.id.etNumber1);
        etNumber2 = findViewById(R.id.etNumber2);
        btnAdd = findViewById(R.id.btnAdd);
        btnSubtract = findViewById(R.id.btnSubtract);
        btnMultiply = findViewById(R.id.btnMultiply);
        btnDivide = findViewById(R.id.btnDivide);
        tvResult = findViewById(R.id.tvResult);

        // Set click listeners for the buttons
        btnAdd.setOnClickListener(this);
        btnSubtract.setOnClickListener(this);
        btnMultiply.setOnClickListener(this);
        btnDivide.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        // Get the input values from the EditText views
        double num1 = Double.parseDouble(etNumber1.getText().toString());
        double num2 = Double.parseDouble(etNumber2.getText().toString());

        switch (v.getId()) {
            case R.id.btnAdd:
                double sum = num1 + num2;
                tvResult.setText(String.valueOf(sum));
                break;
            case R.id.btnSubtract:
                double difference = num1 - num2;
                tvResult.setText(String.valueOf(difference));
                break;
            case R.id.btnMultiply:
                double product = num1 * num2;
                tvResult.setText(String.valueOf(product));
                break;
            case R.id.btnDivide:
                double quotient = num1 / num2;
                tvResult.setText(String.valueOf(quotient));
                break;
            default:
                break;
        }
    }
}
