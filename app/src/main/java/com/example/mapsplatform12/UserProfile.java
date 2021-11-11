package com.example.mapsplatform12;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class UserProfile extends AppCompatActivity implements View.OnClickListener {

    private Button backToMap;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_profile);

        backToMap = (Button) findViewById(R.id.btnBacktomap);
        backToMap.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        startActivity(new Intent(UserProfile.this, MapsActivity.class));
    }
}