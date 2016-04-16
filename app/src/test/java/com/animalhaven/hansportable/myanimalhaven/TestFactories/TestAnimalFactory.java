package com.animalhaven.hansportable.myanimalhaven.TestFactories;


import com.animalhaven.hansportable.myanimalhaven.Domain.Adoption;
import com.animalhaven.hansportable.myanimalhaven.Domain.Animal;
import com.animalhaven.hansportable.myanimalhaven.Domain.Schedule;
import com.animalhaven.hansportable.myanimalhaven.Factories.AnimalFactory;
import com.animalhaven.hansportable.myanimalhaven.FactoryInterfaces.AnimalFactoryInterface;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;

/**
 * Created by Admin on 2016/04/03.
 */
public class TestAnimalFactory {

    @Test
    public void testCreate()
    {
        Adoption adoption = new Adoption.Builder("Peters Family").build();
        List<Schedule> schedules = null;
        AnimalFactoryInterface factory = new AnimalFactory();
        Animal original = factory.createAnimal("Sunshine", 13, 20.5, 3, adoption, schedules, "Dog");

        Assert.assertEquals(original.getAge(), 3);
    }


    @Test
    public void testUpdate()
    {
        Adoption adoption = new Adoption.Builder("Peters Family").build();
        List<Schedule> schedules = null;
        AnimalFactoryInterface factory = new AnimalFactory();
        Animal original = factory.createAnimal("Sunshine", 13, 20.5, 3, adoption, schedules, "Dog");
        Animal copy = new Animal.Builder("Sunshine").copy(original).age(4).build();

        Assert.assertEquals(original.getAge(), 3);
        Assert.assertEquals(copy.getAge(), 4);
        Assert.assertEquals(copy.getBreed(), original.getBreed());
    }

}
