package com.fernandosalas.farmacia.model;

import jakarta.persistence.*;

@Entity
@Table(name = "bill")
public class Bill {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int billId;
    @OneToOne
    @JoinColumn(name = "order_id")
    private Orden orden;
    @ManyToOne
    @JoinColumn(name = "customer_id", nullable = false)
    private Customer customer;
    private double totalAmount;
    private double customerPayment;
    private double insurancePayment;

    public int getBillId() {
        return billId;
    }

    public void setBillId(int billId) {
        this.billId = billId;
    }

    public Orden getOrden() {
        return orden;
    }

    public void setOrden(Orden orden) {
        this.orden = orden;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(double totalAmount) {
        this.totalAmount = totalAmount;
    }

    public double getCustomerPayment() {
        return customerPayment;
    }

    public void setCustomerPayment(double customerPayment) {
        this.customerPayment = customerPayment;
    }

    public double getInsurancePayment() {
        return insurancePayment;
    }

    public void setInsurancePayment(double insurancePayment) {
        this.insurancePayment = insurancePayment;
    }
}
