package com.kode.andelaphase1maintrack.UI.Profile;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.kode.andelaphase1maintrack.R;

public class MyProfileActivity extends AppCompatActivity implements View.OnClickListener{

    ImageView prevBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_profile);

        prevBtn = findViewById(R.id.prevBtn);
        prevBtn.setOnClickListener(this);
    }


    @Override
    public void onClick(View view) {
        finish();
    }


}
