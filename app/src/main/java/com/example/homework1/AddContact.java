package com.example.homework1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class AddContact extends AppCompatActivity {

    EditText nome;
    EditText number;
    Button ok;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_contact);

        nome = findViewById(R.id.idName);
        number = findViewById(R.id.idNumber);
        ok = findViewById(R.id.ok);

        ok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String str_nome = nome.getText().toString();
                String str_teleNum = number.getText().toString();

                Intent intent = new Intent();
                intent.putExtra("nome", str_nome);
                intent.putExtra("number", str_teleNum);
                setResult(RESULT_OK, intent);
                finish();

            }
        });


    }
}