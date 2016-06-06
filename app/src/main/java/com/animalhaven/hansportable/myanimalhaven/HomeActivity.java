package com.animalhaven.hansportable.myanimalhaven;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
    }

    public void addLivingAreaActivity(View view)
    {
        Toast.makeText(HomeActivity.this, "WELCOME", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent (this, EnterLivingAreaDetails.class);
        startActivity(intent);
    }

}
