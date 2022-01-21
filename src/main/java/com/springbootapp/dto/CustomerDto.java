package com.springbootapp.dto;

import com.springbootapp.enums.CustomerStatus;

public class CustomerDto {

    private Integer id;

    private Long idp;

    private String firstName;

    private String lastName;

    private CustomerStatus status;

    private String nif;

    private Long cardNumber;

    public CustomerDto(Integer id, Long idp, String firstName, String lastName, CustomerStatus status, String nif, Long cardNumber) {
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
}
