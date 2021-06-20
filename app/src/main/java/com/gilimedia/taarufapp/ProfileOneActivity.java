package com.gilimedia.taarufapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class ProfileOneActivity extends AppCompatActivity {

    Button lanjut;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile1);

        lanjut = (Button) findViewById(R.id.btNext);

        lanjut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(ProfileOneActivity.this, ProfileTwoActivity.class);
                startActivity(intent);

            }
        });

    }
}
