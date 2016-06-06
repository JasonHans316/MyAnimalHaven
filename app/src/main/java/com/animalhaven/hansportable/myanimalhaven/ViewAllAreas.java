package com.animalhaven.hansportable.myanimalhaven;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.animalhaven.hansportable.myanimalhaven.Config.App;
import com.animalhaven.hansportable.myanimalhaven.Domain.LivingArea;
import com.animalhaven.hansportable.myanimalhaven.Services.Implementations.LivingAreaServiceImpl;

import java.util.ArrayList;

public class ViewAllAreas extends AppCompatActivity {

    private LivingAreaServiceImpl service;
    private boolean isBound;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_all_areas);

    }

    @Override
    protected void onStart()
    {
        super.onStart();

        Intent intent = new Intent(this, LivingAreaServiceImpl.class);
        App.context = this;
        service = LivingAreaServiceImpl.getInstance();
        App.getAppContext().bindService(intent, connection, Context.BIND_AUTO_CREATE);

        try{
            ArrayList<LivingArea> myList = service.getLivingAreas();
            ArrayList<String> displayValues = new ArrayList<String>();

            for(LivingArea area: myList)
                displayValues.add(area.getCode() + " - " + area.getName());

            ArrayAdapter<String> arrayAdapter =
                    new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1, displayValues);

            ListView listView = (ListView)findViewById(R.id.myLivingAreaList);

            listView.setAdapter(arrayAdapter);
        }
        catch(Exception x)
        {
            x.printStackTrace();
        }
    }

    private ServiceConnection connection = new ServiceConnection() {
        @Override
        public void onServiceConnected(ComponentName name, IBinder localService) {
            LivingAreaServiceImpl.ActivateServiceLocalBinder binder
                    = (LivingAreaServiceImpl.ActivateServiceLocalBinder) localService;
            service = binder.getService();
            isBound = true;
        }
        @Override
        public void onServiceDisconnected(ComponentName name) {
            isBound = false;
        }
    };

    public void backToHome(View view)
    {
        Intent intent = new Intent (this, HomeActivity.class);
        startActivity(intent);
    }

}
