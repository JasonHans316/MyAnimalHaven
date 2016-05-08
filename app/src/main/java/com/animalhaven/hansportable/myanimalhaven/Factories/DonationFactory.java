package com.animalhaven.hansportable.myanimalhaven.Factories;

import com.animalhaven.hansportable.myanimalhaven.Domain.Donation;
import com.animalhaven.hansportable.myanimalhaven.FactoryInterfaces.DonationFactoryInterface;

import java.sql.Date;

/**
 * Created by Admin on 2016/04/03.
 */
public class DonationFactory implements DonationFactoryInterface {
    public Donation createDonation(
            Date donationDate,
            double amount,
            String comment)
    {
        return new Donation.Builder(donationDate)
                .amount(amount)
                .comment(comment)
                .build();
    }
}
