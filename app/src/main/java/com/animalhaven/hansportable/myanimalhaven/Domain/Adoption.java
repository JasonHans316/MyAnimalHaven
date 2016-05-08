package com.animalhaven.hansportable.myanimalhaven.Domain;

import com.animalhaven.hansportable.myanimalhaven.DomainInterfaces.IAdoption;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by Admin on 2016/04/03.
 */
//@Entity
public class Adoption implements Serializable, IAdoption{
    private String comment;
    //@Id
    //@GeneratedValue(strategy = GenerationType.AUTO)
    private Long adoptionId;
    private Date adoptionDate;

    public Adoption(Builder value)
    {
        this.comment = value.comment;
        this.adoptionDate = value.adoptionDate;
    }

    public String getComment() {
        return comment;
    }

    public Long getAdoptionId() {
        return adoptionId;
    }

    public Date getAdoptionDate() {
        return adoptionDate;
    }

    public static class Builder{
        String comment;
        Long adoptionId;
        Date adoptionDate;

        public Builder(String comment) {
            this.comment = comment;
        }


        public Builder adoptionDate(Date adoptionDate) {
            this.adoptionDate = adoptionDate;
            return this;
        }

        public Builder copy(Adoption value)
        {
            this.adoptionId = value.adoptionId;
            this.comment = value.comment;
            this.adoptionDate = value.adoptionDate;
            return this;
        }

        public Adoption build(){
            return new Adoption(this);
        }
    }
}
