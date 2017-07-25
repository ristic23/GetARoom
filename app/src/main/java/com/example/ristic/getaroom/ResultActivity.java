package com.example.ristic.getaroom;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class ResultActivity extends AppCompatActivity implements View.OnClickListener
{
    ImageView openListMap;
    boolean mapOrList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        mapOrList = false;
        openListMap = (ImageView)findViewById(R.id.mapBtnResult);
        openListMap.setOnClickListener(this);



        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();
        ft.replace(R.id.mapListFragmetnHolder, new MapFragment()).commit();
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.mapBtnResult:
                FragmentManager fm = getSupportFragmentManager();
                FragmentTransaction ft = fm.beginTransaction();
                if(!mapOrList)
                {
                    ft.replace(R.id.mapListFragmetnHolder, new ListFragment()).commit();
                    mapOrList = true;
                }
                else
                {
                    ft.replace(R.id.mapListFragmetnHolder, new MapFragment()).commit();
                    mapOrList = false;
                }
                break;
            default:
                break;
        }
    }
}
