package com.animalhaven.hansportable.myanimalhaven.Factories.Implementations;

import com.animalhaven.hansportable.myanimalhaven.Domain.Animal;
import com.animalhaven.hansportable.myanimalhaven.Factories.FactoryInterfaces.AnimalFactoryInterface;

/**
 * Created by Admin on 2016/04/03.
 */
public class AnimalFactory implements AnimalFactoryInterface {
    public Animal createAnimal(String name,
            int spaceRequired,
            int weight,
            int age,
            Long adoption,
            Long schedules,
            String breed)
    {
        return new Animal.Builder()
                .name(name)
                .age(age)
                .spaceRequired(spaceRequired)
                .weight(weight)
                .breed(breed)
                .adoption(adoption)
                .schedules(schedules)
                .build();
    }
}
