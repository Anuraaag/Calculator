package com.example.anurag.calculator;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    EditText e1,e2;
    float res, num1, num2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        e1 = (EditText) findViewById(R.id.number1);
        e2 = (EditText) findViewById(R.id.number2);


    }

    public void resetField(View view){
        e1.setText("");
        e2.setText("");
    }

    public void add(View view){
        TextView t1 = (TextView)findViewById(R.id.result);
        num1 = Float.parseFloat(e1.getText().toString());
        num2 = Float.parseFloat(e2.getText().toString());

        res = num1 + num2;
        t1.setText(Float.toString(res));
  //      Toast.makeText(MainActivity.this, "Yo Done", Toast.LENGTH_SHORT).show();

        //keyboard disappearing when this component is focused upon
        InputMethodManager imm = (InputMethodManager) MainActivity.this.getSystemService(Context.INPUT_METHOD_SERVICE);
        if (null != MainActivity.this.getCurrentFocus())
            imm.hideSoftInputFromWindow(MainActivity.this.getCurrentFocus().getApplicationWindowToken(),0);
    }

    public void sub(View view){
        TextView t1 = (TextView)findViewById(R.id.result);
        num1 = Float.parseFloat(e1.getText().toString());
        num2 = Float.parseFloat(e2.getText().toString());

        res = num1 - num2;
        t1.setText(Float.toString(res));
    //    Toast.makeText(MainActivity.this, "Yo Done", Toast.LENGTH_SHORT).show();

        InputMethodManager imm = (InputMethodManager) MainActivity.this.getSystemService(Context.INPUT_METHOD_SERVICE);
        if (null != MainActivity.this.getCurrentFocus())
            imm.hideSoftInputFromWindow(MainActivity.this.getCurrentFocus().getApplicationWindowToken(),0);

    }

    public void mul(View view){
        TextView t1 = (TextView)findViewById(R.id.result);
        num1 = Float.parseFloat(e1.getText().toString());
        num2 = Float.parseFloat(e2.getText().toString());

        res = num1 * num2;
        t1.setText(Float.toString(res));
      //  Toast.makeText(MainActivity.this, "Yo Done", Toast.LENGTH_SHORT).show();

        InputMethodManager imm = (InputMethodManager) MainActivity.this.getSystemService(Context.INPUT_METHOD_SERVICE);
        if (null != MainActivity.this.getCurrentFocus())
            imm.hideSoftInputFromWindow(MainActivity.this.getCurrentFocus().getApplicationWindowToken(),0);

    }

    public void div(View view){
        TextView t1 = (TextView)findViewById(R.id.result);
        num1 = Float.parseFloat(e1.getText().toString());
        num2 = Float.parseFloat(e2.getText().toString());

        res = num1 / num2;
        t1.setText(Float.toString(res));
//        Toast.makeText(MainActivity.this, "Yo Done", Toast.LENGTH_SHORT).show();

        InputMethodManager imm = (InputMethodManager) MainActivity.this.getSystemService(Context.INPUT_METHOD_SERVICE);
        if (null != MainActivity.this.getCurrentFocus())
            imm.hideSoftInputFromWindow(MainActivity.this.getCurrentFocus().getApplicationWindowToken(),0);

    }

    public void remainder(View view){

        int num1 = Integer.parseInt(e1.getText().toString());
        int num2 = Integer.parseInt(e2.getText().toString());
        TextView t1 = (TextView)findViewById(R.id.result);
        int res = num1 % num2;
        t1.setText(Integer.toString(res));
        //Toast.makeText(MainActivity.this, "Yo Done", Toast.LENGTH_SHORT).show();

        InputMethodManager imm = (InputMethodManager) MainActivity.this.getSystemService(Context.INPUT_METHOD_SERVICE);
        if (null != MainActivity.this.getCurrentFocus())
            imm.hideSoftInputFromWindow(MainActivity.this.getCurrentFocus().getApplicationWindowToken(),0);

    }
}