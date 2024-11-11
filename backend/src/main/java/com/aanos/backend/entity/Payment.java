package com.aanos.backend.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Payment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String paymentType;
    private String transactionId;

    @OneToMany(mappedBy = "payment")
    private List<Order> orders;

    //Constructors
    public Payment () {}
    public Payment(String paymentType, String transactionId, List<Order> orders) {
        this.paymentType = paymentType;
        this.transactionId = transactionId;
        this.orders = orders;
    }

    // Getters and setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPaymentType() {
        return paymentType;
    }

    public void setPaymentType(String paymentType) {
        this.paymentType = paymentType;
    }

    public String getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    public List<Order> getOrders() {
        return orders;
    }

    public void setOrders(List<Order> orders) {
        this.orders = orders;
    }
}

