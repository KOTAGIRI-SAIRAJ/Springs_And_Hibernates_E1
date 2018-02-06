package com.sb.training.model;

import javax.persistence.*;

@Entity
@Table(name = "house")
public class House {

    private int id;
    private String colony;
    private String city;
    private Person person;

    @Override
    public String toString() {
        return "House{" +
                "id=" + id +
                ", colony='" + colony + '\'' +
                ", city='" + city + '\'' +
                ", person=" + person +
                '}';
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "person_house_id")
    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    @Column(name = "city")
    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Column(name = "colony")
    public String getColony() {
        return colony;
    }

    public void setColony(String colony) {
        this.colony = colony;
    }
}
