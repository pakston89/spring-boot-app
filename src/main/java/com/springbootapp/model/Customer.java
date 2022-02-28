package com.springbootapp.model;

import com.springbootapp.enums.CustomerStatus;
import com.springbootapp.util.TableNames;
import lombok.Getter;
import lombok.Setter;
import javax.persistence.*;

@Entity
@Getter @Setter
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

}
