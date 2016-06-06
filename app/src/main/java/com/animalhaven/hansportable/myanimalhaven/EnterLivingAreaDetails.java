package com.animalhaven.hansportable.myanimalhaven;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import com.animalhaven.hansportable.myanimalhaven.Domain.LivingArea;

public class EnterLivingAreaDetails extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_enter_living_area_details);
    }

    protected void openSave(View view)
    {
        EditText code = (EditText)findViewById(R.id.codeText);
        EditText name = (EditText)findViewById(R.id.nameText);
        EditText space = (EditText)findViewById(R.id.spaceText);

        LivingArea newArea = new LivingArea.Builder()
                .code(code.getText().toString())
                .name(name.getText().toString())
                .spaceAvailable(Integer.parseInt(space.getText().toString()))
                .active(true)
                .build();

        Intent areaActivity = new Intent(this, AddLivingAreaActivity.class);
        areaActivity.putExtra("code", newArea.getCode());
        areaActivity.putExtra("name", newArea.getName());
        areaActivity.putExtra("space", newArea.getSpaceAvailable());
        areaActivity.putExtra("active", newArea.isActive());

        startActivity(areaActivity);
    }



}
