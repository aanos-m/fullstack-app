package com.aanos.backend.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;

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

    // Constructors, Getters, and Setters
    public Customer () {
    }

    public Customer(String cusUsername, String name, String email, String address, String dob, String profilePic, String currentDate) {
        this.cusUsername = cusUsername;
        this.name = name;
        this.email = email;
        this.address = address;
        this.dob = dob;
        this.profilePic = profilePic;
        this.creationDate = currentDate;
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
    public String getDob() { return dob; }
    public void setDob(String dob) { this.dob = dob; }
    public String getProfilePic() { return profilePic; }
    public void setProfilePic(String profilePic) { this.profilePic = profilePic; }
    public String getCreationDate() { return creationDate; }
    @JsonProperty(access = JsonProperty.Access.READ_ONLY)
    public void setCreationDate(String creationDate) { this.creationDate = creationDate; }
}