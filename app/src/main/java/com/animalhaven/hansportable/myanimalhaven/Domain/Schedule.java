package com.animalhaven.hansportable.myanimalhaven.Domain;

import com.animalhaven.hansportable.myanimalhaven.DomainInterfaces.ISchedule;

import java.io.Serializable;

/**
 * Created by Admin on 2016/04/03.
 */
//@Entity
public class Schedule implements Serializable{
    private String activity;
    //@Id
    //@GeneratedValue(strategy = GenerationType.AUTO)
    private Long scheduleId;
    private DateTimeRange dtr;

    public Schedule() {
    }

    public Schedule(Builder value)
    {
        this.activity = value.activity;
        this.dtr = value.dtr;
    }
    
    public String getActivity() {
        return activity;
    }

    public Long getScheduleId() {
        return scheduleId;
    }

    public DateTimeRange getDtr() {
        return dtr;
    }

    public static class Builder{
        String activity;
        DateTimeRange dtr;
        private Long id;

        public Builder id(Long id) {
            this.id = id;
            return this;
        }

        public Builder activity(String activity) {
            this.activity = activity;
            return this;
        }


        public Builder dateTimeRange(DateTimeRange dtr) {
            this.dtr = dtr;
            return this;
        }

        public Builder copy(Schedule value)
        {
            this.activity = value.activity;
            this.dtr = value.dtr;
            return this;
        }

        public Schedule build(){
            return new Schedule(this);
        }
    }
}
