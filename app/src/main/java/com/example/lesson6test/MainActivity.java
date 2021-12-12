package com.example.lesson6test;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.example.lesson6test.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding;
    Math math;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        math = new Math();

        binding.btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int num1 = Integer.parseInt(binding.etNum1.getText().toString());
                int num2 = Integer.parseInt(binding.etNum2.getText().toString());

                binding.result.setText(String.valueOf(math.add(num1, num2)));
            }
        });

        binding.btnSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int num1 = Integer.parseInt(binding.etNum1.getText().toString());
                int num2 = Integer.parseInt(binding.etNum2.getText().toString());

                binding.result.setText(String.valueOf(math.sub(num1, num2)));
            }
        });

        binding.btnMultiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int num1 = Integer.parseInt(binding.etNum1.getText().toString());
                int num2 = Integer.parseInt(binding.etNum2.getText().toString());

                binding.result.setText(String.valueOf(math.multiply(num1, num2)));
            }
        });

        binding.btnDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int num1 = Integer.parseInt(binding.etNum1.getText().toString());
                int num2 = Integer.parseInt(binding.etNum2.getText().toString());

                binding.result.setText(String.valueOf(math.div(num1, num2)));
            }
        });


    }
}