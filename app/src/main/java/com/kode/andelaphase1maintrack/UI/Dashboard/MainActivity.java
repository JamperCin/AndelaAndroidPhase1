package com.kode.andelaphase1maintrack.UI.Dashboard;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;

import com.kode.andelaphase1maintrack.R;
import com.kode.andelaphase1maintrack.UI.Profile.MyProfileActivity;
import com.kode.andelaphase1maintrack.UI.WebKit.AboutAlc;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    RelativeLayout aboutAlcBtn, myProfileBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initVies();
    }


    private void initVies(){
        aboutAlcBtn = findViewById(R.id.aboutAlcBtn);
        myProfileBtn = findViewById(R.id.myProfileBtn);


        aboutAlcBtn.setOnClickListener(this);
        myProfileBtn.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {

        switch (view.getId()){
            case R.id.aboutAlcBtn :
                 startActivity(new Intent(this, AboutAlc.class));
                 break;

            case R.id.myProfileBtn :
                startActivity(new Intent(this, MyProfileActivity.class));
                break;
        }
    }





}
