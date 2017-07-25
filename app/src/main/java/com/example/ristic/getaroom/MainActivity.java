package com.example.ristic.getaroom;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;


public class MainActivity extends Activity implements View.OnClickListener {

    TextView textViewLogoApp;
    ImageView imageViewMyLocation;
    ImageView imageViewDrawer;
    ImageView imageViewNalog;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textViewLogoApp = (TextView) findViewById(R.id.nameOfApp);

        imageViewMyLocation = (ImageView) findViewById(R.id.yourLocationBtn);
        imageViewMyLocation.setOnClickListener(this);

        imageViewDrawer = (ImageView) findViewById(R.id.searchBtn);
        imageViewDrawer.setOnClickListener(this);

        imageViewDrawer = (ImageView) findViewById(R.id.accountBtn);
        imageViewDrawer.setOnClickListener(this);

    }


    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.yourLocationBtn:
                Intent intentResult = new Intent(this, ResultActivity.class);
                startActivity(intentResult);
                break;
            case R.id.accountBtn:
                Intent intentAccount = new Intent(this, NalogActivity.class);
                startActivity(intentAccount);
                break;
            default:
                textViewLogoApp.setText("Defult");
                break;


        }


    }
}
