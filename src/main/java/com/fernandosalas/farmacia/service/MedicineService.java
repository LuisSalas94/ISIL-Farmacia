package com.fernandosalas.farmacia.service;

import com.fernandosalas.farmacia.model.Medicine;
import com.fernandosalas.farmacia.repository.MedicineRepository;
import com.fernandosalas.farmacia.service.implementation.MedicineServiceImplementation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MedicineService implements MedicineServiceImplementation {

    @Autowired
    private MedicineRepository medicineRepository;

    @Override
    public Medicine add(Medicine medicine) {
        return medicineRepository.save(medicine);
    }

    @Override
    public Medicine update(Medicine medicine) {
        return medicineRepository.save(medicine);
    }

    @Override
    public List<Medicine> list() {
        return medicineRepository.findAll();
    }

    @Override
    public Medicine getById(int id) {
        return medicineRepository.findById(id).get();
    }

    @Override
    public void delete(int id) {
        medicineRepository.deleteById(id);
    }
}
