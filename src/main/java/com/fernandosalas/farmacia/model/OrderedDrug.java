package com.fernandosalas.farmacia.model;

import jakarta.persistence.*;

@Entity
@Table(name = "ordered_drug")
public class OrderedDrug {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int orderedDrugId;
    @ManyToOne
    @JoinColumn(name = "orden_id")
    private Orden orden;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "medicine_id")
    private Medicine medicine;
    private int orderQuantity;
    private double price;

    public int getOrderedDrugId() {
        return orderedDrugId;
    }

    public void setOrderedDrugId(int orderedDrugId) {
        this.orderedDrugId = orderedDrugId;
    }

    public Orden getOrden() {
        return orden;
    }

    public void setOrden(Orden orden) {
        this.orden = orden;
    }

    public Medicine getMedicine() {
        return medicine;
    }

    public void setMedicine(Medicine medicine) {
        this.medicine = medicine;
    }

    public int getOrderQuantity() {
        return orderQuantity;
    }

    public void setOrderQuantity(int orderQuantity) {
        this.orderQuantity = orderQuantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
