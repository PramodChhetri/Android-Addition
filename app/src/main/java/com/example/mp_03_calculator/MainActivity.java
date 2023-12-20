package com.example.mp_03_calculator;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.ContextMenu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextClock;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText et_num1, et_num2;
    TextView tv_result;
    Button bt_calculate;

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);

        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.context_menu,menu);

    }

    @Override
    public boolean onContextItemSelected(@NonNull MenuItem item) {
        int fnum = Integer.parseInt(et_num1.getText().toString());
        int snum =Integer.parseInt(et_num2.getText().toString());


        if(item.getItemId() == R.id.add){

            int sum = fnum + snum;
            tv_result.setText("Sum is :" + sum);

        } else if (item.getItemId() == R.id.subtract) {

            int diff = snum - fnum;
            tv_result.setText("Difference is :"+diff);

        }else if(item.getItemId() == R.id.multiply){

            int product = snum * fnum;
            tv_result.setText("Product is :"+product);

        }else if(item.getItemId()==R.id.divide){

            int quotient = snum / fnum;
            tv_result.setText("Quotient is :"+ quotient);

        }
        return super.onContextItemSelected(item);

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et_num1 = findViewById(R.id.et_FirstNumber);
        et_num2 = findViewById(R.id.et_SecondNumber);
        tv_result =findViewById(R.id.tv_Result);
        bt_calculate =findViewById(R.id.btn_Calculate);

        bt_calculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                registerForContextMenu(bt_calculate);
            }
        });


    }
}