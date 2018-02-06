package com.sb.training.model;

import javax.persistence.*;

@Entity
@Table(name = "finger_print")
public class Fingerprint {

    private int id;
    private Person person;

    @Override
    public String toString() {
        return "Fingerprint{" +
                "id=" + id +
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

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "person_fingerprint_id", nullable = false)
    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }
}
