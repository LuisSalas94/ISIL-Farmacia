package com.fernandosalas.farmacia.service.implementation;

import com.fernandosalas.farmacia.model.Medicine;

import java.util.List;

public interface MedicineServiceImplementation {
    Medicine add(Medicine medicine);
    Medicine update(Medicine medicine);
    List<Medicine> list();
    Medicine getById(int id);
    void delete(int id);
}
