package com.animalhaven.hansportable.myanimalhaven.Factories.Implementations;

import com.animalhaven.hansportable.myanimalhaven.Domain.User;
import com.animalhaven.hansportable.myanimalhaven.Factories.FactoryInterfaces.UserFactoryInterface;

/**
 * Created by Admin on 2016/04/03.
 */
public class UserFactory implements UserFactoryInterface {
    public User createUser(
            String name,
            String surname,
            String idNumber,
            Long adoptions,
            Long donations,
            Long schedules)
    {
        return new User.Builder()
                .name(name)
                .idNumber(idNumber)
                .surname(surname)
                .adoptionId(adoptions)
                .donationId(donations)
                .scheduleId(schedules)
                .build();
    }
}
