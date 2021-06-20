package com.gilimedia.taarufapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class StartprofileActivity extends AppCompatActivity {

    TextView lanjut;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.start_profile);

        lanjut = (TextView) findViewById(R.id.txNext);

        lanjut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(StartprofileActivity.this, ProfileOneActivity.class);
                startActivity(intent);

            }
        });

    }
}
