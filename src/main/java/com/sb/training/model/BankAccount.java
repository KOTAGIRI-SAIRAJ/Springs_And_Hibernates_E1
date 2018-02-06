package com.sb.training.model;

import javax.persistence.*;

@Entity
@Table(name = "bank_account")
public class BankAccount {

    private int id;
    private int accountNumber;
    private String accountHolderName;
    private Person person;

    @Override
    public String toString() {
        return "BankAccount{" +
                "id=" + id +
                ", accountNumber=" + accountNumber +
                ", accountHolderName='" + accountHolderName + '\'' +
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

    @Column(name = "account_number")
    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    @Column(name = "account_holder_name")
    public String getAccountHolderName() {
        return accountHolderName;
    }

    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "person_account_id")
    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }
}
