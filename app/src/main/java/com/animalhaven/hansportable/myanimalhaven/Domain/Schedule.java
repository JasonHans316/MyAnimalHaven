package com.animalhaven.hansportable.myanimalhaven.Domain;


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
    private int timeRequired;
    private Long scheduleTypeId;

    public Schedule() {
    }

    public Schedule(Builder value)
    {
        this.scheduleId = value.id;
        this.activity = value.activity;
        this.timeRequired = value.timeRequired;
        this.scheduleTypeId = value.scheduleTypeId;
    }
    
    public String getActivity() {
        return activity;
    }

    public Long getScheduleId() {
        return scheduleId;
    }

    public Long getScheduleTypeId() {
        return scheduleTypeId;
    }

    public int getTimeRequired() {
        return timeRequired;
    }

    public static class Builder{
        String activity;
        int timeRequired;
        private Long id;
        private Long scheduleTypeId;

        public Builder id(Long id) {
            this.id = id;
            return this;
        }

        public Builder activity(String activity) {
            this.activity = activity;
            return this;
        }

        public Builder scheduleTypeId(Long scheduleTypeId)
        {
            this.scheduleTypeId = scheduleTypeId;
            return this;
        }

        public Builder timeRequired(int timeRequired) {
            this.timeRequired = timeRequired;
            return this;
        }

        public Builder copy(Schedule value)
        {
            this.id = value.scheduleId;
            this.activity = value.activity;
            this.timeRequired = value.timeRequired;
            return this;
        }

        public Schedule build(){
            return new Schedule(this);
        }
    }
}
