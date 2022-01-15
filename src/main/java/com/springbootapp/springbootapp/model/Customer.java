package com.springbootapp.springbootapp.model;

import javax.persistence.*;

@Entity
@Table(name ="customers")
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "idp")
    private Integer idp;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "nif")
    private String nif;

    @Column(name = "card_number")
    private String cardNumber;

    public Customer() {

    }

    public Customer(Integer id, Integer idp, String firstName, String lastName, String nif, String cardNumber) {
        this.id = id;
        this.idp = idp;
        this.firstName = firstName;
        this.lastName = lastName;
        this.nif = nif;
        this.cardNumber = cardNumber;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getIdp() {
        return idp;
    }

    public void setIdp(Integer idp) {
        this.idp = idp;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getNif() {
        return nif;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", idp=" + idp +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", nif='" + nif + '\'' +
                ", cardNumber='" + cardNumber + '\'' +
                '}';
    }
}
