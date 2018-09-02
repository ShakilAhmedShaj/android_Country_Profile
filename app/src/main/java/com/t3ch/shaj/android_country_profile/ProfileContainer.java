package com.t3ch.shaj.android_country_profile;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class ProfileContainer extends AppCompatActivity {
    private ImageView imageView;
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile_container);

        imageView = findViewById(R.id.IV_id);
        textView = findViewById(R.id.Des_ID);

        Bundle bundle = getIntent().getExtras();
        if (bundle != null) {

            String countryName = bundle.getString("name");

            showDetails(countryName);
        }


    }

    void showDetails(String countryName) {

        if(countryName.equals("bangladesh"))
        {
            imageView.setImageResource(R.drawable.bd);
            textView.setText(R.string.bd_des);
        }
        if(countryName.equals("pakistan"))
        {
            imageView.setImageResource(R.drawable.pak);
            textView.setText(R.string.pak_des);
        }
        if(countryName.equals("india"))
        {
            imageView.setImageResource(R.drawable.in);
            textView.setText(R.string.in_des);
        }

    }
}
