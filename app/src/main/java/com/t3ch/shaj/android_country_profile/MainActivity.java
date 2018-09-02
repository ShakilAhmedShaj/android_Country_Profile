package com.t3ch.shaj.android_country_profile;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button bdButton, pakButton, inButton;
    private Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bdButton = findViewById(R.id.bdButton_ID);
        pakButton = findViewById(R.id.pakButton_ID);
        inButton = findViewById(R.id.inButton_ID);

        bdButton.setOnClickListener(this);
        pakButton.setOnClickListener(this);
        inButton.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {

        if (v.getId() == R.id.bdButton_ID) {
            intent = new Intent(MainActivity.this, ProfileContainer.class);
            intent.putExtra("name", "bangladesh");
            startActivity(intent);

        }

        if (v.getId() == R.id.pakButton_ID) {
            intent = new Intent(MainActivity.this, ProfileContainer.class);
            intent.putExtra("name", "pakistan");
            startActivity(intent);

        }

        if (v.getId() == R.id.inButton_ID) {
            intent = new Intent(MainActivity.this, ProfileContainer.class);
            intent.putExtra("name", "india");
            startActivity(intent);

        }

    }

    @Override
    public void onBackPressed() {

        AlertDialog.Builder alertBuilder = new AlertDialog.Builder(MainActivity.this);
        alertBuilder.setTitle(R.string.title_text);
        alertBuilder.setMessage(R.string.MSG_text);
        alertBuilder.setIcon(R.drawable.warning);

        alertBuilder.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                finish();

            }
        });

        alertBuilder.setNegativeButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {

            }
        });

        alertBuilder.setNeutralButton("Cancel", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {

            }
        });


        AlertDialog alertDialog = alertBuilder.create();
        alertDialog.show();
    }
}
