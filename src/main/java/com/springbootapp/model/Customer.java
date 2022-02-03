package com.springbootapp.model;

import com.springbootapp.enums.CustomerStatus;
import com.springbootapp.util.TableNames;
import javax.persistence.*;

/**
 * The Customer entity class.
 * @author pause
 */
@Entity
@Table(name = TableNames.CUSTOMERS)
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "idp")
    private Long idp;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "status")
    private CustomerStatus status;

    @Column(name = "nif")
    private String nif;

    @Column(name = "card_number")
    private Long cardNumber;

    public Customer() {

    }

    public Customer(Integer id, Long idp, String firstName, String lastName, CustomerStatus status, String nif, Long cardNumber) {
        this.id = id;
        this.idp = idp;
        this.firstName = firstName;
        this.lastName = lastName;
        this.status = status;
        this.nif = nif;
        this.cardNumber = cardNumber;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Long getIdp() {
        return idp;
    }

    public void setIdp(Long idp) {
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

    public CustomerStatus getStatus() {
        return status;
    }

    public void setStatus(CustomerStatus status) {
        this.status = status;
    }

    public String getNif() {
        return nif;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }

    public Long getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(Long cardNumber) {
        this.cardNumber = cardNumber;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", idp=" + idp +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", status=" + status +
                ", nif='" + nif + '\'' +
                ", cardNumber=" + cardNumber +
                '}';
    }
}
