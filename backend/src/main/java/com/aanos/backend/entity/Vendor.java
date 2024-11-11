package com.aanos.backend.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Vendor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String contactInfo;

    @OneToMany(mappedBy = "vendor")
    private List<Product> products;

    //Constructors
    public Vendor() {}
    public Vendor(Long id, String name, String contactInfo, List<Product> products) {
        this.id = id;
        this.name = name;
        this.contactInfo = contactInfo;
        this.products = products;
    }

    // Getters and setters
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

    public String getContactInfo() {
        return contactInfo;
    }

    public void setContactInfo(String contactInfo) {
        this.contactInfo = contactInfo;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }
}
