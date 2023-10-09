package com.fernandosalas.farmacia.model;

import jakarta.persistence.*;

@Entity
@Table(name = "prescribe_drug")
public class PrescribedDrug {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int prescribedDrudId;
    @ManyToOne
    @JoinColumn(name = "prescription_id")
    private Prescription prescription;
    @OneToOne
    @JoinColumn(name = "medicine_id")
    private Medicine medicine;
    private int prescribedQuantity;
    private int refillQuantity;

    public int getPrescribedDrudId() {
        return prescribedDrudId;
    }

    public void setPrescribedDrudId(int prescribedDrudId) {
        this.prescribedDrudId = prescribedDrudId;
    }

    public Prescription getPrescription() {
        return prescription;
    }

    public void setPrescription(Prescription prescription) {
        this.prescription = prescription;
    }

    public Medicine getMedicine() {
        return medicine;
    }

    public void setMedicine(Medicine medicine) {
        this.medicine = medicine;
    }

    public int getPrescribedQuantity() {
        return prescribedQuantity;
    }

    public void setPrescribedQuantity(int prescribedQuantity) {
        this.prescribedQuantity = prescribedQuantity;
    }

    public int getRefillQuantity() {
        return refillQuantity;
    }

    public void setRefillQuantity(int refillQuantity) {
        this.refillQuantity = refillQuantity;
    }
}
