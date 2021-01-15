package org.addresses.models;

import javax.persistence.*;

@Entity
@Table(name = "houses")
public class House {
    @Id
    private String house_id;

    @ManyToOne
    @JoinColumn(name="street_id")
    private Street street_id;

    private String number;

    private String liter;

    private String korpus;

    public House() {}

    public void setHouse_id(String house_id) {
        this.house_id = house_id;
    }
    public void setStreet_id(Street street_id) {
        this.street_id = street_id;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public void setLiter(String liter) {
        this.liter = liter;
    }

    public void setKorpus(String korpus) {
        this.korpus = korpus;
    }

    public String getHouse_id() {
        return house_id;
    }

    public Street getStreet_id() {
        return street_id;
    }

    public String getNumber() {
        return number;
    }

    public String getLiter() {
        return liter;
    }

    public String getKorpus() {
        return korpus;
    }
}
