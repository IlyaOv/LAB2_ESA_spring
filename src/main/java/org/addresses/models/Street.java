package org.addresses.models;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(schema = "public", name = "streets")
public class Street {
    @Id
    @Column(name = "street_id")
    private int street_id;
    @Column(name = "name")
    private String name;
    @Column(name = "type")
    private String type;
    @OneToMany(mappedBy = "street_id", cascade = CascadeType.ALL)
    private List<House> housesList = new ArrayList<>();

    public Street() {}

    public int getStreet_id() {
        return street_id;
    }

    public void setStreet_id(int street_id) {
        this.street_id = street_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public List<House> getHousesList() {
        return housesList;
    }

    public void setHousesList(List<House> housesList) {
        this.housesList = housesList;
    }
}
