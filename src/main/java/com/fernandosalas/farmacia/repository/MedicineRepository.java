package com.fernandosalas.farmacia.repository;

import com.fernandosalas.farmacia.model.Medicine;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MedicineRepository extends JpaRepository<Medicine, Integer> {
}
