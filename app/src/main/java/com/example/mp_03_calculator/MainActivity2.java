package com.example.mp_03_calculator;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    EditText et_Principle, et_Rate, et_Time;
    TextView tv_SIResult;
    Button btnResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        et_Principle = findViewById(R.id.et_Principle);
        et_Rate = findViewById(R.id.et_Rate);
        et_Time = findViewById(R.id.et_Time);
        btnResult = findViewById(R.id.btn_SI);

        tv_SIResult = findViewById(R.id.tv_SIResult);

        btnResult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int p = Integer.parseInt(et_Principle.getText().toString());
                int t = Integer.parseInt(et_Rate.getText().toString());
                int r = Integer.parseInt(et_Time.getText().toString());

                int si = (p*t*r)/100;

                tv_SIResult.setText("Simple Interest " + si);
            }
        });


    }
}