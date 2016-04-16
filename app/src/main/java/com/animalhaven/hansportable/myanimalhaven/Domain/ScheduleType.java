package com.animalhaven.hansportable.myanimalhaven.Domain;

import com.animalhaven.hansportable.myanimalhaven.DomainInterfaces.IScheduleType;

import java.io.Serializable;
import java.util.List;

/**
 * Created by Admin on 2016/04/03.
 */
//@Entity
public class ScheduleType implements Serializable, IScheduleType{
    private String code;
    //@Id
    //@GeneratedValue(strategy = GenerationType.AUTO)
    private Long scheduleTypeId;
    private String name;
    private boolean active;
    private List<Schedule> schedules;

    public ScheduleType(Builder value)
    {
        this.code = value.code;
        this.name = value.name;
        this.active = value.active;
        this.schedules = value.schedules;

    }

    @Override
    public List<Schedule> getSchedules() {
        return schedules;
    }

    public String getCode() {
        return code;
    }

    public Long getScheduleTypeId() {
        return scheduleTypeId;
    }

    public String getName() {
        return name;
    }

    public boolean isActive() {
        return active;
    }

    public static class Builder{
        String code;
        int scheduleTyeId;
        String name;
        boolean active;
        List<Schedule> schedules;

        public Builder(String code) {
            this.code = code;
        }

        public Builder schedules(List<Schedule> schedules) {
            this.schedules = schedules;
            return this;
        }

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder active(boolean active) {
            this.active = active;
            return this;
        }

        public Builder copy(ScheduleType value)
        {
            this.code = value.code;
            this.name = value.name;
            this.active = value.active;

            return this;
        }

        public ScheduleType build()
        {
            return new ScheduleType(this);
        }
    }
}
