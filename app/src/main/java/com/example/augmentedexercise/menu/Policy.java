package com.example.augmentedexercise.menu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.augmentedexercise.Navigation_Drawer;
import com.example.augmentedexercise.R;

public class Policy extends AppCompatActivity {

    ImageView btnClose;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_policy);

        btnClose = (ImageView) findViewById(R.id.btnClose);
        btnClose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Policy.this, Navigation_Drawer.class);
                startActivity(intent);
            }
        });
    }
}