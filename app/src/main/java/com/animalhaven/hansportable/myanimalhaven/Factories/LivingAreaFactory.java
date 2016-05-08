package com.animalhaven.hansportable.myanimalhaven.Factories;

import com.animalhaven.hansportable.myanimalhaven.Domain.Animal;
import com.animalhaven.hansportable.myanimalhaven.Domain.LivingArea;
import com.animalhaven.hansportable.myanimalhaven.FactoryInterfaces.LivingAreaFactoryInterface;

import java.util.List;

/**
 * Created by Admin on 2016/04/03.
 */
public class LivingAreaFactory implements LivingAreaFactoryInterface{
    public LivingArea createLivingArea(
            String name,
            String code,
            boolean active,
            int spaceAvailable,
            List<Animal> animals){
        return new LivingArea.Builder(name)
                .code(code)
                .active(active)
                .spaceAvailable(spaceAvailable)
                .animals(animals)
                .build();
    }
}
