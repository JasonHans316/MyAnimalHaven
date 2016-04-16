package com.animalhaven.hansportable.myanimalhaven.Domain;

import com.animalhaven.hansportable.myanimalhaven.DomainInterfaces.IDonation;

import java.io.Serializable;
import java.sql.Date;

/**
 * Created by Admin on 2016/04/03.
 */
//@Entity
public class Donation implements Serializable, IDonation {
    //@Id
    //@GeneratedValue(strategy = GenerationType.AUTO)
    private Long donationId;
    private Date donationDate;
    private double amount;
    private String comment;

    public Donation(Builder value)
    {
        this.amount = value.amount;
        this.comment = value.comment;
        this.donationDate = value.donationDate;
    }

    public Date getDonationDate() {
        return donationDate;
    }

    public Long getDonationId() {
        return donationId;
    }

    public double getAmount() {
        return amount;
    }

    public String getComment() {
        return comment;
    }

    public static class Builder {
        Date donationDate;
        double amount;
        String comment;

        public Builder(Date donationDate) {
            this.donationDate = donationDate;
        }

        public Builder amount(double amount) {
            this.amount = amount;
            return this;
        }

        public Builder comment(String comment) {
            this.comment = comment;
            return this;
        }

        public Builder copy(Donation value){
            this.amount = value.amount;
            this.comment = value.comment;
            this.donationDate = value.donationDate;
            return this;
        }

        public Donation build()
        {
            return new Donation(this);
        }
    }
}
