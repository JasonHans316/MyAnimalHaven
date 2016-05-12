package com.animalhaven.hansportable.myanimalhaven.Services.Implementations;

import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;

import com.animalhaven.hansportable.myanimalhaven.Config.GlobalContext;
import com.animalhaven.hansportable.myanimalhaven.Domain.Donation;
import com.animalhaven.hansportable.myanimalhaven.Repository.Implementations.DonationRepositoryImpl;
import com.animalhaven.hansportable.myanimalhaven.Repository.Interfaces.DonationRepository;
import com.animalhaven.hansportable.myanimalhaven.Services.Interfaces.DonationServiceInterface;

import java.util.ArrayList;
import java.util.Set;

/**
 * Created by Admin on 2016/05/08.
 */
public class DonationServiceImpl extends Service implements DonationServiceInterface {

    final private DonationRepository donationRepository;

    private final IBinder localBinder = new ActivateServiceLocalBinder();

    private static DonationServiceImpl service = null;

    public static DonationServiceImpl getInstance()
    {
        if(service == null)
            service = new DonationServiceImpl();
        return service;
    }

    private DonationServiceImpl()
    {
        donationRepository = new DonationRepositoryImpl(GlobalContext.getAppContext());
    }

    @Override
    public IBinder onBind(Intent intent) {
        return localBinder;
    }

    public class ActivateServiceLocalBinder extends Binder {
        public DonationServiceImpl getService() {
            return DonationServiceImpl.this;
        }
    }

/**
 * Used to store donations made to the shelter
 *
 * */
    @Override
    public Donation makeDonation(Donation newDonation) {
        try{
            return donationRepository.save(newDonation);
        }
        catch(Exception x)
        {
            x.printStackTrace();
        }
        return null;
    }

    @Override
    public ArrayList<Donation> donationsEqualTo(int amount) {
        try{
            ArrayList<Donation> myList = new ArrayList<>();
            ArrayList<Donation> result = new ArrayList<>();
            Set<Donation> mySet = donationRepository.findAll();

            if(!myList.addAll(mySet))
                return null;

            for(int i=0; i<myList.size(); i++)
                if(myList.get(i).getAmount() == amount)
                    result.add(myList.get(i));

            if(result.size() > 0)
                return result;
            else
                return new ArrayList<Donation>();

        }
        catch(Exception x)
        {
            x.printStackTrace();
            return null;
        }
    }

    @Override
    public ArrayList<Donation> donationsBelow(int amount) {
        try{
            ArrayList<Donation> myList = new ArrayList<>();
            ArrayList<Donation> result = new ArrayList<>();
            Set<Donation> mySet = donationRepository.findAll();

            if(!myList.addAll(mySet))
                return null;

            for(int i=0; i<myList.size(); i++)
                if(myList.get(i).getAmount() < amount)
                    result.add(myList.get(i));

            if(result.size() > 0)
                return result;
            else
                return new ArrayList<Donation>();

        }
        catch(Exception x)
        {
            x.printStackTrace();
            return null;
        }
    }

    @Override
    public ArrayList<Donation> donationsAbove(int amount) {
        try{
            ArrayList<Donation> myList = new ArrayList<>();
            ArrayList<Donation> result = new ArrayList<>();
            Set<Donation> mySet = donationRepository.findAll();

            if(!myList.addAll(mySet))
                return null;

            for(int i=0; i<myList.size(); i++)
                if(myList.get(i).getAmount() > amount)
                    result.add(myList.get(i));

            if(result.size() > 0)
                return result;
            else
                return new ArrayList<Donation>();

        }
        catch(Exception x)
        {
            x.printStackTrace();
            return null;
        }
    }
}
