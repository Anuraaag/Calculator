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

      TextView t1, t2;
      String s1;

//    float res, num1, num2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        t1 = findViewById(R.id.equation);
        t2 = findViewById(R.id.result);
    }

    public void keyPressed (View view)
    {
        switch (view.getId()) {

            case R.id.one:    enter('1');
                              break;

            case R.id.two:    enter('2');
                              break;

            case R.id.three:  enter('3');
                              break;

            case R.id.four:   enter('4');
                              break;

            case R.id.five:   enter('5');
                              break;

            case R.id.six:    enter('6');
                              break;

            case R.id.seven:  enter('7');
                              break;

            case R.id.eight:  enter('8');
                              break;

            case R.id.nine:   enter('9');
                              break;

            case R.id.zero:   enter('0');
                              break;

            case R.id.dot:    if (t1.getText().toString().indexOf('.') == -1) {
                                enter('.');
                              }
                              break;

            case R.id.equal:  enter('6');
                              break;

            case R.id.del:
                              break;

            case R.id.divide: enter('8');
                              break;

            case R.id.multiply:enter('9');
                              break;

            case R.id.minus:  enter('0');
                              break;

            case R.id.plus:   if (t1.getText().toString().indexOf('.') == -1) {
                                enter('.');
                              }
                              break;
        }
    }

    public void enter(char ch)
    {
        if(t1.getText().equals(""))
        {
            t1.setText(Character.toString(ch));
        }
        else
        {
            s1 = t1.getText().toString() + ch;
            t1.setText(s1);
        }
    }

//    public void resetField(View view){
//        e1.setText("");
//        e2.setText("");
//    }
//
//    public void add(View view){
//        TextView t1 = (TextView)findViewById(R.id.result);
//        num1 = Float.parseFloat(e1.getText().toString());
//        num2 = Float.parseFloat(e2.getText().toString());
//
//        res = num1 + num2;
//        t1.setText(Float.toString(res));
//  //      Toast.makeText(MainActivity.this, "Yo Done", Toast.LENGTH_SHORT).show();
//
//        //keyboard disappearing when this component is focused upon
//        InputMethodManager imm = (InputMethodManager) MainActivity.this.getSystemService(Context.INPUT_METHOD_SERVICE);
//        if (null != MainActivity.this.getCurrentFocus())
//            imm.hideSoftInputFromWindow(MainActivity.this.getCurrentFocus().getApplicationWindowToken(),0);
//    }
//
//    public void sub(View view){
//        TextView t1 = (TextView)findViewById(R.id.result);
//        num1 = Float.parseFloat(e1.getText().toString());
//        num2 = Float.parseFloat(e2.getText().toString());
//
//        res = num1 - num2;
//        t1.setText(Float.toString(res));
//    //    Toast.makeText(MainActivity.this, "Yo Done", Toast.LENGTH_SHORT).show();
//
//        InputMethodManager imm = (InputMethodManager) MainActivity.this.getSystemService(Context.INPUT_METHOD_SERVICE);
//        if (null != MainActivity.this.getCurrentFocus())
//            imm.hideSoftInputFromWindow(MainActivity.this.getCurrentFocus().getApplicationWindowToken(),0);
//
//    }
//
//    public void mul(View view){
//        TextView t1 = (TextView)findViewById(R.id.result);
//        num1 = Float.parseFloat(e1.getText().toString());
//        num2 = Float.parseFloat(e2.getText().toString());
//
//        res = num1 * num2;
//        t1.setText(Float.toString(res));
//      //  Toast.makeText(MainActivity.this, "Yo Done", Toast.LENGTH_SHORT).show();
//
//        InputMethodManager imm = (InputMethodManager) MainActivity.this.getSystemService(Context.INPUT_METHOD_SERVICE);
//        if (null != MainActivity.this.getCurrentFocus())
//            imm.hideSoftInputFromWindow(MainActivity.this.getCurrentFocus().getApplicationWindowToken(),0);
//
//    }
//
//    public void div(View view){
//        TextView t1 = (TextView)findViewById(R.id.result);
//        num1 = Float.parseFloat(e1.getText().toString());
//        num2 = Float.parseFloat(e2.getText().toString());
//
//        res = num1 / num2;
//        t1.setText(Float.toString(res));
////        Toast.makeText(MainActivity.this, "Yo Done", Toast.LENGTH_SHORT).show();
//
//        InputMethodManager imm = (InputMethodManager) MainActivity.this.getSystemService(Context.INPUT_METHOD_SERVICE);
//        if (null != MainActivity.this.getCurrentFocus())
//            imm.hideSoftInputFromWindow(MainActivity.this.getCurrentFocus().getApplicationWindowToken(),0);
//
//    }
//
//    public void remainder(View view){
//
//        int num1 = Integer.parseInt(e1.getText().toString());
//        int num2 = Integer.parseInt(e2.getText().toString());
//        TextView t1 = (TextView)findViewById(R.id.result);
//        int res = num1 % num2;
//        t1.setText(Integer.toString(res));
//        //Toast.makeText(MainActivity.this, "Yo Done", Toast.LENGTH_SHORT).show();
//
//        InputMethodManager imm = (InputMethodManager) MainActivity.this.getSystemService(Context.INPUT_METHOD_SERVICE);
//        if (null != MainActivity.this.getCurrentFocus())
//            imm.hideSoftInputFromWindow(MainActivity.this.getCurrentFocus().getApplicationWindowToken(),0);
//
//    }
}