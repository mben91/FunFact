package com.example.benattimohamed.funfact;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText nameTxt = (EditText) findViewById(R.id.nbrtxt);
        Button btn = (Button) findViewById(R.id.callbtn);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intentSayHello = new Intent(getApplicationContext(), Main2Activity.class);

                intentSayHello.putExtra("name", nameTxt.getText());
                startActivity(intentSayHello);

//                Uri numero = Uri.parse("tel:" + nbr.getText());
//                Intent appeler = new Intent(Intent.ACTION_CALL, numero);
//                if (ActivityCompat.checkSelfPermission(MainActivity.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
//                    // TODO: Consider calling
//                    //    ActivityCompat#requestPermissions
//                    // here to request the missing permissions, and then overriding
//                    //   public void onRequestPermissionsResult(int requestCode, String[] permissions,
//                    //                                          int[] grantResults)
//                    // to handle the case where the user grants the permission. See the documentation
//                    // for ActivityCompat#requestPermissions for more details.
//
//                    Toast.makeText(MainActivity.this, "Permission Not Granted", Toast.LENGTH_SHORT).show();
//                    return;
//                }
//
//                Toast.makeText(MainActivity.this, "Permission Granted", Toast.LENGTH_SHORT).show();
//                startActivity(appeler);
            }
        });

    }
}
