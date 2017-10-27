package com.example.felipe.lottieprueba;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView con, and, com;
    private ImageView udenar, mariana, cesmag, tres;
    private static final int duration = 3500;
    private Typeface fuente;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String ruta= "fuentes/leipziger.otf";
        this.fuente = Typeface.createFromAsset(getAssets(),ruta);

        con = (TextView) findViewById(R.id.com);
        and = (TextView) findViewById(R.id.and);
        com = (TextView) findViewById(R.id.con);

        tres = (ImageView) findViewById(R.id.tres);
        udenar = (ImageView) findViewById(R.id.udenar);
        mariana = (ImageView) findViewById(R.id.mariana);
        cesmag = (ImageView) findViewById(R.id.cesmag);

        con.setTypeface(fuente);
        and.setTypeface(fuente);
        com.setTypeface(fuente);



        final AlphaAnimation fadeIn = new AlphaAnimation(0f,1f);
        fadeIn.setDuration(duration);
        fadeIn.setStartOffset(0);
        fadeIn.setFillAfter(true);

        tres.startAnimation(fadeIn);
        con.startAnimation(fadeIn);
        and.startAnimation(fadeIn);
        com.startAnimation(fadeIn);

        udenar.startAnimation(fadeIn);
        mariana.startAnimation(fadeIn);
        cesmag.startAnimation(fadeIn);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

                Intent intent = new Intent(MainActivity.this, Main2Activity.class);
                startActivity(intent);
                finish();

            }
        },4500);

    }
}
