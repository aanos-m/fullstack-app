package com.aanos.backend.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;

@Entity
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "customer_id")
    @NotNull
    private Long id;
    @Column(name = "cus_username")
    private String cusUsername;
    private String name;
    private String email;
    private String address;

    // Constructors, Getters, and Setters
    public Customer () {
    }

    public Customer(String cusUsername, String name, String email, String address) {
        this.cusUsername = cusUsername;
        this.name = name;
        this.email = email;
        this.address = address;
    }
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) { this.email = email; }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) { this.address = address; }

}