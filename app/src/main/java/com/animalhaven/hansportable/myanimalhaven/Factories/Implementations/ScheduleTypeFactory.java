package com.animalhaven.hansportable.myanimalhaven.Factories.Implementations;

import com.animalhaven.hansportable.myanimalhaven.Domain.ScheduleType;
import com.animalhaven.hansportable.myanimalhaven.Factories.FactoryInterfaces.ScheduleTypeFactoryInterface;

/**
 * Created by Admin on 2016/04/03.
 */
public class ScheduleTypeFactory implements ScheduleTypeFactoryInterface {
    public ScheduleType createScheduleType(String code,
                                           String name,
                                           boolean active)
    {
        return new ScheduleType.Builder()
                .code(code)
                .name(name)
                .active(active)
                .build();
    }
}
