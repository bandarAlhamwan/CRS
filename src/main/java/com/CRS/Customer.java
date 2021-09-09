package com.CRS;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "customer")
@Data
public class Customer {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
	
    @Column
   // @NotBlank
    String firstName;
    
    @Column
    //@NotBlank
    String lastName;
    
    @Column
    String emailAddress;
    
    @Column
    String address;
    
    @Column
    String city;
    
    @Column
    String country;
    
    @Column
    String phoneNumber;
    
}
