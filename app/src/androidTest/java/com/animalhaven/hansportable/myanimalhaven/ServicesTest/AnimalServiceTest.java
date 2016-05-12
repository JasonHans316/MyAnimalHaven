package com.animalhaven.hansportable.myanimalhaven.ServicesTest;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.test.AndroidTestCase;

import com.animalhaven.hansportable.myanimalhaven.Config.GlobalContext;
import com.animalhaven.hansportable.myanimalhaven.Domain.Animal;

import junit.framework.Assert;

import org.junit.Test;

import com.animalhaven.hansportable.myanimalhaven.Services.Implementations.AnimalServiceImpl;


/**
 * Created by Admin on 2016/05/08.
 */
public class AnimalServiceTest  extends AndroidTestCase {
    private AnimalServiceImpl myService;
    private boolean isBound;
    Long newAnimalId;
    @Override
    public void setUp() throws Exception {
        super.setUp();
        Intent intent = new Intent(this.getContext(), AnimalServiceImpl.class);
        GlobalContext.context = this.getContext();
        myService = AnimalServiceImpl.getInstance();
        GlobalContext.getAppContext().bindService(intent, connection, Context.BIND_AUTO_CREATE);
    }

    private ServiceConnection connection = new ServiceConnection() {
        @Override
        public void onServiceConnected(ComponentName name, IBinder service) {
            AnimalServiceImpl.ActivateServiceLocalBinder binder
                    = (AnimalServiceImpl.ActivateServiceLocalBinder) service;
            myService = binder.getService();
            isBound = true;
        }

        @Override
        public void onServiceDisconnected(ComponentName name) {
            isBound = false;

        }
    };

    @Test
    public void testCreateAnimal()
    {
        Animal original = new Animal.Builder()
                .adoption(new Long(1))
                .age(2)
                .breed("Cat")
                .name("Tiger")
                .schedules(new Long(1))
                .spaceRequired(300)
                .weight(9)
                .build();
        original = myService.storeAnimal(original);
        if(original.getAnimalId() != null)
            newAnimalId = original.getAnimalId();
        Assert.assertNotNull(original.getAnimalId());
    }

    @Test
    public void testUpdateAnimal()
    {
        Animal original = new Animal.Builder()
                .adoption(new Long(1))
                .age(3)
                .breed("Cat")
                .name("Tiger")
                .schedules(new Long(1))
                .spaceRequired(300)
                .weight(14)
                .build();

        original = myService.storeAnimal(original);

        Animal updatedAnimal = new Animal.Builder().copy(original).age(4).build();
        Assert.assertTrue(myService.updateAnimalDetails(updatedAnimal));
    }

    @Test
    public void testFindByName()
    {
        Assert.assertNotNull(myService.findByName("iger"));
    }
}
