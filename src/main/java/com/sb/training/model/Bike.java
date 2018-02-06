package com.sb.training.model;

import javax.persistence.*;

@Entity
@Table(name = "bike")
public class Bike {

    private int id;
    private String bikeBrand;
    private Person person;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Column(name = "bike_brand")
    public String getBikeBrand() {
        return bikeBrand;
    }

    public void setBikeBrand(String bikeBrand) {
        this.bikeBrand = bikeBrand;
    }

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "person_bike_id", nullable = false)
    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }
}
