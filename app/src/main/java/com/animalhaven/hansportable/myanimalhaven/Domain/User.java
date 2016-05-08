package com.animalhaven.hansportable.myanimalhaven.Domain;

import com.animalhaven.hansportable.myanimalhaven.DomainInterfaces.IUser;

import java.io.Serializable;
import java.util.List;

/**
 * Created by Admin on 2016/04/03.
 */
//@Entity
public class User implements Serializable, IUser{
    //@Id
    //@GeneratedValue(strategy = GenerationType.AUTO)
    private Long userId;
    private String name;
    private String surname;
    private String idNumber;
    private List<Adoption> adoptions;
    private List<Donation> donations;
    private List<Schedule> schedules;

    public User(Builder value)
    {
        this.name = value.name;
        this.idNumber = value.idNumber;
        this.surname = value.surname;
        this.adoptions = value.adoptions;
        this.donations = value.donations;
        this.schedules = value.schedules;
    }

    @Override
    public List<Adoption> getAdoptions() {
        return adoptions;
    }

    @Override
    public List<Donation> getDonations() {
        return donations;
    }

    @Override
    public List<Schedule> getSchedules() {
        return schedules;
    }

    public Long getUserId()
    {
        return userId;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getIdNumber() {
        return idNumber;
    }


    public static class Builder {
        String name;
        String surname;
        String idNumber;
        List<Adoption> adoptions;
        List<Donation> donations;
        List<Schedule> schedules;

        public Builder(String name) {
            this.name = name;
        }

        public Builder adoptions(List<Adoption> adoptions) {
            this.adoptions = adoptions;
            return this;
        }

        public Builder donations(List<Donation> donations) {
            this.donations = donations;
            return this;
        }

        public Builder schedules(List<Schedule> schedules) {
            this.schedules = schedules;
            return this;
        }

        public Builder surname(String surname) {
            this.surname = surname;
            return this;
        }

        public Builder idNumber(String idNumber) {
            this.idNumber = idNumber;
            return this;
        }

        public Builder copy(User value)
        {
            this.name = value.name;
            this.idNumber = value.idNumber;
            this.surname = value.surname;
            this.adoptions = value.adoptions;
            this.donations = value.donations;
            this.schedules = value.schedules;
            return this;
        }

        public User build()
        {
            return new User(this);
        }
    }
}
