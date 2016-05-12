package com.animalhaven.hansportable.myanimalhaven.Factories.Implementations;

import com.animalhaven.hansportable.myanimalhaven.Factories.FactoryInterfaces.UserRoleFactoryInterface;
import com.animalhaven.hansportable.myanimalhaven.Domain.UserRole;

/**
 * Created by Admin on 2016/04/03.
 */
public class UserRoleFactory implements UserRoleFactoryInterface {
    public UserRole createUserRole(
            String name,
            String code,
            Long users,
            boolean active)
    {
        return new UserRole.Builder()
                .name(name)
                .code(code)
                .active(active)
                .userId(users)
                .build();
    }
}
