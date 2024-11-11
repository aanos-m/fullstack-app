package com.aanos.backend.entity;

import jakarta.persistence.*;
import org.aspectj.weaver.ast.Or;

import java.util.Date;
import java.util.List;

@Entity
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Date orderDate;
    private Double totalAmount;

    @ManyToOne
    @JoinColumn(name = "customer_id")
    private Customer customer;

    @OneToMany(mappedBy = "order")
    private List<OrderItem> orderItems;

    @ManyToOne
    @JoinColumn(name = "payment_id")
    private Payment payment;

    //Constructors
    public Order() {}
    public Order(Long id, Date orderDate, Double totalAmount, Customer customer, List<OrderItem> orderItems, Payment payment) {
        this.id = id;
        this.orderDate = orderDate;
        this.totalAmount = totalAmount;
        this.customer = customer;
        this.orderItems = orderItems;
        this.payment = payment;
    }

    // Getters and setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    public Double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(Double totalAmount) {
        this.totalAmount = totalAmount;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public List<OrderItem> getOrderItems() {
        return orderItems;
    }

    public void setOrderItems(List<OrderItem> orderItems) {
        this.orderItems = orderItems;
    }

    public Payment getPayment() {
        return payment;
    }

    public void setPayment(Payment payment) {
        this.payment = payment;
    }
}
