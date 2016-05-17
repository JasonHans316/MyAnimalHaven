package com.animalhaven.hansportable.myanimalhaven.RepositoryTests;

import com.animalhaven.hansportable.myanimalhaven.Repository.Interfaces.ScheduleTypeRepository;

import junit.framework.Assert;
import junit.framework.TestSuite;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;


/**
 * Created by Admin on 2016/04/24.
 */


@RunWith(Suite.class)
@Suite.SuiteClasses({
        AdoptionRepositoryTest.class,
        AnimalRepositoryTest.class,
        DonationRepositoryTest.class,
        LivingAreaRepositoryTest.class,
        ScheduleTypeRepository.class,
        //ScheduleRepositoryTest.class,
        UserRepositoryTest.class,
        UserRoleRepositoryTest.class
})

public class RepositoryTestSuite {
    @Test
    public void testThis()
    {
        Assert.assertTrue(true);
    }

/*
    @Test
    public void testSuite()
    {
        Class[] tests = {
                AdoptionRepositoryTest.class,
                AnimalRepositoryTest.class,
                DonationRepositoryTest.class,
                LivingAreaRepositoryTest.class,
                ScheduleTypeRepository.class,
                //ScheduleRepositoryTest.class,
                UserRepositoryTest.class,
                UserRoleRepositoryTest.class
        };
        if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.JELLY_BEAN) {
            TestSuite suite = new TestSuite(tests);
        }

    }
*/
}
