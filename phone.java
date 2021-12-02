package com.example.implicit_phone_096;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.net.Uri;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EditText t1= findViewById(R.id.phonecall);
        Button call=findViewById(R.id.call);
        call.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                    String num1=t1.getText().toString();
                    Intent it=new Intent(Intent.ACTION_DIAL);
                    it.setData(Uri.parse("tel:" + num1));
                    startActivity(it);
                }

        });
    }
}
