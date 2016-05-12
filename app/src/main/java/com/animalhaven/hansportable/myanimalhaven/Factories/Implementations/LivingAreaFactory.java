package com.animalhaven.hansportable.myanimalhaven.Factories.Implementations;

import com.animalhaven.hansportable.myanimalhaven.Domain.LivingArea;
import com.animalhaven.hansportable.myanimalhaven.Factories.FactoryInterfaces.LivingAreaFactoryInterface;

/**
 * Created by Admin on 2016/04/03.
 */
public class LivingAreaFactory implements LivingAreaFactoryInterface{
    public LivingArea createLivingArea(
            String name,
            String code,
            boolean active,
            int spaceAvailable,
            Long animals){
        return new LivingArea.Builder()
                .name(name)
                .code(code)
                .active(active)
                .spaceAvailable(spaceAvailable)
                .animalId(animals)
                .build();
    }
}
