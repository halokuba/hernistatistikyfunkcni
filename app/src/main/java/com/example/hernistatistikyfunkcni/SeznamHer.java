package com.example.hernistatistikyfunkcni;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class SeznamHer extends AppCompatActivity {
    private ImageButton androidImageButton7;
    private ImageButton androidImageButton8;
    private ImageButton androidImageButton9;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seznam_her);

        androidImageButton7 = (ImageButton) findViewById(R.id.imageButton7);
        androidImageButton7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openSeznamHer();
            }
        });

        androidImageButton8 = (ImageButton) findViewById(R.id.imageButton8);
        androidImageButton8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMainActivity();
            }
        });

        androidImageButton9 = (ImageButton) findViewById(R.id.imageButton9);
        androidImageButton9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMojeHry();
            }
        });
    }
    public void openMojeHry() {
        Intent intent = new Intent(this, MojeHry.class);
        startActivity(intent);
    }
    public void openSeznamHer() {
        Intent seznamHer = new Intent(this, SeznamHer.class);
        startActivity(seznamHer);
    }
    public void openMainActivity() {
        Intent mainActivity = new Intent(this, MainActivity.class);
        startActivity(mainActivity);
    }
}