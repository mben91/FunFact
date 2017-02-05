package com.example.benattimohamed.funfact;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Intent intentSayHello = getIntent();
        String name = intentSayHello.getStringExtra("name").toString();

        Toast.makeText(Main2Activity.this, name, Toast.LENGTH_SHORT).show();

        //((TextView)findViewById(R.id.txtactivity2)).setText(name);


    }
}
