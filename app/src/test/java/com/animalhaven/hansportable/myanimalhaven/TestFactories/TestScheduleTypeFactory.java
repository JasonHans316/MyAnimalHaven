package com.animalhaven.hansportable.myanimalhaven.TestFactories;


import com.animalhaven.hansportable.myanimalhaven.Domain.Schedule;
import com.animalhaven.hansportable.myanimalhaven.Domain.ScheduleType;
import com.animalhaven.hansportable.myanimalhaven.Factories.ScheduleTypeFactory;
import com.animalhaven.hansportable.myanimalhaven.FactoryInterfaces.ScheduleTypeFactoryInterface;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;

/**
 * Created by Admin on 2016/04/03.
 */
public class TestScheduleTypeFactory {
    @Test
    public void testCreate()
    {
        List<Schedule> schedules = null;
        ScheduleTypeFactoryInterface factory = new ScheduleTypeFactory();
        ScheduleType original = factory.createScheduleType("LOL", "Steven", schedules,true);

        Assert.assertEquals("LOL", original.getCode());
    }

    @Test
    public void testUpdate()
    {
        List<Schedule> schedules = null;
        ScheduleTypeFactoryInterface factory = new ScheduleTypeFactory();
        ScheduleType original = factory.createScheduleType("LOL", "Steven", schedules,true);
        ScheduleType copy = new ScheduleType.Builder("TEST").copy(original).active(false).build();

        Assert.assertEquals(false, copy.isActive());
        Assert.assertEquals(true, original.isActive());
        Assert.assertEquals(original.getName(), copy.getName());
    }
}
