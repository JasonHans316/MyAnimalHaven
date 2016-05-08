package com.animalhaven.hansportable.myanimalhaven.TestFactories;


import com.animalhaven.hansportable.myanimalhaven.Domain.Animal;
import com.animalhaven.hansportable.myanimalhaven.Domain.LivingArea;
import com.animalhaven.hansportable.myanimalhaven.Factories.LivingAreaFactory;
import com.animalhaven.hansportable.myanimalhaven.FactoryInterfaces.LivingAreaFactoryInterface;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;

/**
 * Created by Admin on 2016/04/03.
 */
public class TestLivingAreaFactory {
    @Test
    public void testCreate()
    {
        List<Animal> animals = null;
        LivingAreaFactoryInterface factory = new LivingAreaFactory();
        LivingArea original = factory.createLivingArea("Kennels", "KS", true, 50, animals);

        Assert.assertEquals(50, original.getSpaceAvailable());
    }

    @Test
    public void testUpdate()
    {
        List<Animal> animals = null;
        LivingAreaFactoryInterface factory = new LivingAreaFactory();
        LivingArea original = factory.createLivingArea("Kennels", "KS", true, 50, animals);
        LivingArea copy = new LivingArea.Builder("Cages").copy(original).spaceAvailable(45).build();

        Assert.assertEquals(45, copy.getSpaceAvailable());
        Assert.assertEquals(50, original.getSpaceAvailable());
        Assert.assertEquals(original.getName(), copy.getName());
    }

}
