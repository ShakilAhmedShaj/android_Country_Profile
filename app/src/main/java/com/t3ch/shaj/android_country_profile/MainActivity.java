package com.t3ch.shaj.android_country_profile;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

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
}
