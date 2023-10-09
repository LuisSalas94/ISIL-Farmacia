package com.fernandosalas.farmacia.controller;

import com.fernandosalas.farmacia.model.Medicine;
import com.fernandosalas.farmacia.service.MedicineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/medicine")
public class MedicineController {

    @Autowired
    private MedicineService medicineService;

    @GetMapping
    public List<Medicine> list() {
        return medicineService.list();
    }

    @GetMapping("/{id}")
    public Medicine getById(@PathVariable("id") int id) {
        return medicineService.getById(id);
    }

    @PostMapping
    public Medicine add(@RequestBody Medicine medicine) {
        return medicineService.add(medicine);
    }

    @PutMapping
    public Medicine update(@RequestBody Medicine medicine) {
        return medicineService.update(medicine);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") int id) {
        medicineService.delete(id);
    }
}
