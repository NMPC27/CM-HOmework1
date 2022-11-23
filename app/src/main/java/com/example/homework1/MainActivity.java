package com.example.homework1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    EditText teleNum;
    Button callbtn;
    Button num0;
    Button num1;
    Button num2;
    Button num3;
    Button num4;
    Button num5;
    Button num6;
    Button num7;
    Button num8;
    Button num9;
    Button hastag;
    Button astrix;
    Button del;
    Button sd1;
    Button sd2;
    Button sd3;




    static int PERMISSION_CODE= 100;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        teleNum = findViewById(R.id.editNum);
        callbtn = findViewById(R.id.call);
        num0 = findViewById(R.id.num0);
        num1 = findViewById(R.id.num1);
        num2 = findViewById(R.id.num2);
        num3 = findViewById(R.id.num3);
        num4 = findViewById(R.id.num4);
        num5 = findViewById(R.id.num5);
        num6 = findViewById(R.id.num6);
        num7 = findViewById(R.id.num7);
        num8 = findViewById(R.id.num8);
        num9 = findViewById(R.id.num9);
        hastag = findViewById(R.id.hastag);
        astrix = findViewById(R.id.astrix);
        del = findViewById(R.id.del);
        sd1 = findViewById(R.id.SD1);
        sd2 = findViewById(R.id.SD2);
        sd3 = findViewById(R.id.SD3);


        if (ContextCompat.checkSelfPermission(MainActivity.this,Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED){
            ActivityCompat.requestPermissions(MainActivity.this,new String[]{Manifest.permission.CALL_PHONE},PERMISSION_CODE);
        }

        callbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String str_teleNum = teleNum.getText().toString();
                Intent i = new Intent(Intent.ACTION_CALL);
                i.setData(Uri.parse("tel:"+str_teleNum));
                startActivity(i);

            }
        });

        sd1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String buttonText = ((Button)v).getText().toString();

                if (buttonText!="Na"){
                    Intent i = new Intent(Intent.ACTION_CALL);
                    i.setData(Uri.parse("tel:"+buttonText));
                    startActivity(i);
                }
            }
        });

        sd1.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {

                String str_teleNum = teleNum.getText().toString();
                sd1.setText(str_teleNum);

                return true;
            }
        });

        sd2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String buttonText = ((Button)v).getText().toString();

                if (buttonText!="Na"){
                    Intent i = new Intent(Intent.ACTION_CALL);
                    i.setData(Uri.parse("tel:"+buttonText));
                    startActivity(i);
                }
            }
        });

        sd2.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {

                String str_teleNum = teleNum.getText().toString();
                sd2.setText(str_teleNum);

                return true;
            }
        });

        sd3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String buttonText = ((Button)v).getText().toString();

                if (buttonText!="Na"){
                    Intent i = new Intent(Intent.ACTION_CALL);
                    i.setData(Uri.parse("tel:"+buttonText));
                    startActivity(i);
                }
            }
        });

        sd3.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {

                String str_teleNum = teleNum.getText().toString();
                sd3.setText(str_teleNum);

                return true;
            }
        });



        num0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                teleNum.setText(teleNum.getText()+"0");
            }
        });

        num1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                teleNum.setText(teleNum.getText()+"1");
            }
        });

        num2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                teleNum.setText(teleNum.getText()+"2");
            }
        });

        num3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                teleNum.setText(teleNum.getText()+"3");
            }
        });

        num4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                teleNum.setText(teleNum.getText()+"4");
            }
        });

        num5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                teleNum.setText(teleNum.getText()+"5");
            }
        });

        num6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                teleNum.setText(teleNum.getText()+"6");
            }
        });

        num7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                teleNum.setText(teleNum.getText()+"7");
            }
        });

        num8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                teleNum.setText(teleNum.getText()+"8");
            }
        });

        num9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                teleNum.setText(teleNum.getText()+"9");
            }
        });

        hastag.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                teleNum.setText(teleNum.getText()+"#");
            }
        });

        astrix.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                teleNum.setText(teleNum.getText()+"*");
            }
        });

        del.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String tmp = teleNum.getText().toString();

                teleNum.setText(teleNum.getText().delete(tmp.length()-1 , tmp.length() ));
            }
        });


    }
}