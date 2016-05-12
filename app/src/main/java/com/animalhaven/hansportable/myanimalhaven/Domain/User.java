package com.animalhaven.hansportable.myanimalhaven.Domain;


import java.io.Serializable;
import java.util.List;

/**
 * Created by Admin on 2016/04/03.
 */
//@Entity
public class User implements Serializable{
    //@Id
    //@GeneratedValue(strategy = GenerationType.AUTO)
    private Long userId;
    private String name;
    private String surname;
    private String idNumber;
    private Long adoptionId;
    private Long donationId;
    private Long scheduleId;

    public User(Builder value)
    {
        this.userId = value.id;
        this.name = value.name;
        this.idNumber = value.idNumber;
        this.surname = value.surname;
        this.adoptionId = value.adoptionId;
        this.donationId = value.donationId;
        this.scheduleId = value.scheduleId;
    }

    public Long getAdoption() {
        return adoptionId;
    }

    public Long getDonation() {
        return donationId;
    }

    public Long getSchedule() {
        return scheduleId;
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
        Long adoptionId;
        Long donationId;
        Long scheduleId;
        private Long id;

        public Builder id(Long id) {
            this.id = id;
            return this;
        }


        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder adoptionId(Long adoptionId) {
            this.adoptionId = adoptionId;
            return this;
        }

        public Builder donationId(Long donationId) {
            this.donationId = donationId;
            return this;
        }

        public Builder scheduleId(Long scheduleId) {
            this.scheduleId = scheduleId;
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
            this.id = value.userId;
            this.name = value.name;
            this.idNumber = value.idNumber;
            this.surname = value.surname;
            this.adoptionId = value.adoptionId;
            this.donationId = value.donationId;
            this.scheduleId = value.scheduleId;
            return this;
        }

        public User build()
        {
            return new User(this);
        }
    }
}
