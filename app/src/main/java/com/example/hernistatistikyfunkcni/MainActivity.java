package com.example.hernistatistikyfunkcni;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {
    private Button button;
    private ImageButton androidImageButton;
    private ImageButton androidImageButton2;
    private ImageButton androidImageButton3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMojeHry();
            }
        });

        androidImageButton = (ImageButton) findViewById(R.id.imageButton);
        androidImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openSeznamHer();
            }
        });

        androidImageButton2 = (ImageButton) findViewById(R.id.imageButton2);
        androidImageButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMainActivity();
            }
        });

        androidImageButton3 = (ImageButton) findViewById(R.id.imageButton3);
        androidImageButton3.setOnClickListener(new View.OnClickListener() {
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