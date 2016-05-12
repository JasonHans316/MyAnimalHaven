package com.animalhaven.hansportable.myanimalhaven.Factories.FactoryInterfaces;

import com.animalhaven.hansportable.myanimalhaven.Domain.Adoption;
import com.animalhaven.hansportable.myanimalhaven.Domain.Animal;
import com.animalhaven.hansportable.myanimalhaven.Domain.Schedule;

import java.util.List;

/**
 * Created by Hans Portable on 4/7/2016.
 */
public interface AnimalFactoryInterface {
    Animal createAnimal(String name,
                        int spaceRequired,
                        int weight,
                        int age,
                        Long adoption,
                        Long schedules,
                        String breed);
}
