package com.springbootapp.springbootapp.dto;

import com.springbootapp.springbootapp.enums.CustomerStatus;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
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
}
