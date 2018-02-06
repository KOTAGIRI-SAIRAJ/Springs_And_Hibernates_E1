package com.sb.training.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "person")
public class Person {

    private int id;
    private String Name;
    private List<House> houseList;
    private Bike bike;
    private Fingerprint fingerprint;
    private List<BankAccount> bankAccountList;

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", Name='" + Name + '\'' +
                ", houseList=" + houseList +
                ", bike=" + bike +
                ", fingerprint=" + fingerprint +
                ", bankAccountList=" + bankAccountList +
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

    @Column(name = "name")
    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    @OneToMany(cascade =  CascadeType.ALL,mappedBy = "person")
    public List<House> getHouseList() {
        return houseList;
    }

    public void setHouseList(List<House> houseList) {
        this.houseList = houseList;
    }

    @OneToOne(mappedBy = "person")
    public Bike getBike() {
        return bike;
    }

    public void setBike(Bike bike) {
        this.bike = bike;
    }

    @OneToOne(cascade = CascadeType.ALL,mappedBy = "person")
    public Fingerprint getFingerprint() {
        return fingerprint;
    }

    public void setFingerprint(Fingerprint fingerprint) {
        this.fingerprint = fingerprint;
    }

    @OneToMany(cascade = CascadeType.ALL,mappedBy = "person")
    public List<BankAccount> getBankAccountList() {
        return bankAccountList;
    }

    public void setBankAccountList(List<BankAccount> bankAccountList) {
        this.bankAccountList = bankAccountList;
    }
}
