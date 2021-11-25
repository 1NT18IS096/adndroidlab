package com.example.calc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    boolean isnewop=true;
    EditText endl;
    String op;
    String oldnumber;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        endl=findViewById(R.id.result);



    }
    public void numberEvent(View view){
        if(isnewop){
            endl.setText("");

        }
        isnewop=false;

        String number=endl.getText().toString();
        switch(view.getId()){
            case R.id.bu1:
                number=number+1;
                break;
            case R.id.bu2:
                number=number+2;
                break;
            case R.id.bu3:
                number=number+3;
                break;
            case R.id.bu4:
                number=number+4;
                break;
            case R.id.bu5:
                number=number+5;
                break;
            case R.id.bu6:
                number=number+6;
                break;
            case R.id.bu7:
                number=number+7;
                break;
            case R.id.bu8:
                number=number+8;
                break;
            case R.id.bu9:
                number=number+9;
                break;
            case R.id.bu0:
                number=number+0;
                break;
            case R.id.budot:
                number=number+".";
                break;

        }
        endl.setText(number);

    }
    public void operatorEvent(View view){
          isnewop=true;
          oldnumber=endl.getText().toString();
          switch(view.getId())
          {
              case R.id.budiv:op="/";
                               break;
              case R.id.bumul:op="*";
                              break;
              case R.id.buadd:op="+";
                              break;
              case R.id.busub:op="-";
                              break;
          }
    }
    public void equalEvent(View view)
    {
        String newnumber=endl.getText().toString();
        double result=0.0;
        switch(op){
            case "+":result=Double.parseDouble(oldnumber)+Double.parseDouble(newnumber);
                     break;
            case "-":result=Double.parseDouble(oldnumber)-Double.parseDouble(newnumber);
                     break;
            case "*":result=Double.parseDouble(oldnumber)*Double.parseDouble(newnumber);
                     break;
            case "/":result=Double.parseDouble(oldnumber)/Double.parseDouble(newnumber);
                     break;
        }
        endl.setText(result+"");

    }
    public void acevent(View view){
        endl.setText("0");
        isnewop=true;
    }



}
