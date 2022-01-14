package com.webApp.webApp.model;

import javax.persistence.*;

@Entity
@Table(name ="users")
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Integer id;

	@Column(name = "first_name")
	private String firstName;

	@Column(name = "last_name")
	private String lastName;

	@Column(name = "nif")
	private String nif;

	@Column(name = "card_number")
	private String cardNumber;
	
  public User() {

	}

  public User(Integer id, String firstName, String lastName, String nif, String cardNumber) {
		this.id = id;
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
}