package com.aanos.backend.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;

import java.util.List;

@Entity
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "customer_id")
    @JsonProperty(access = JsonProperty.Access.READ_ONLY)
    private Long id;
    @Column(name = "cus_username")
    private String cusUsername;

    private String name;
    private String email;
    private String address;
    private String dob;
    private String profilePic;
    private String creationDate;
    @OneToMany(mappedBy = "customer")
    private List<Order> orders;

    @OneToMany(mappedBy = "customer")
    private List<Review> reviews;

    //Constructors
    public Customer () {}
    public Customer(Long id, String cusUsername, String name, String email, String address, String dob, String profilePic, String creationDate, List<Order> orders, List<Review> reviews) {
        this.id = id;
        this.cusUsername = cusUsername;
        this.name = name;
        this.email = email;
        this.address = address;
        this.dob = dob;
        this.profilePic = profilePic;
        this.creationDate = creationDate;
        this.orders = orders;
        this.reviews = reviews;
    }

    //Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCusUsername() {
        return cusUsername;
    }

    public void setCusUsername(String cusUsername) {
        this.cusUsername = cusUsername;
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

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getProfilePic() {
        return profilePic;
    }

    public void setProfilePic(String profilePic) {
        this.profilePic = profilePic;
    }

    public String getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(String creationDate) {
        this.creationDate = creationDate;
    }

    public List<Order> getOrders() {
        return orders;
    }

    public void setOrders(List<Order> orders) {
        this.orders = orders;
    }

    public List<Review> getReviews() {
        return reviews;
    }

    public void setReviews(List<Review> reviews) {
        this.reviews = reviews;
    }
}