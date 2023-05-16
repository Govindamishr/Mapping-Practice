package com.geekster.govinda.assignmentmapping.service;

import com.geekster.govinda.assignmentmapping.model.*;
import com.geekster.govinda.assignmentmapping.repository.ILaptopRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service

public class LaptopService {
    @Autowired
    ILaptopRepo iLaptopRepo;

    public void addLaptop(List<Laptop> laptop) {
        List<Laptop>allList=iLaptopRepo.saveAll(laptop);
    }

    public List<Laptop> getAllLaptop() {
        return iLaptopRepo.findAll();
    }


    public String deleteById(Long laptopId) {
        Optional<Laptop> laptop = iLaptopRepo.findById(laptopId);
        if (laptop.isEmpty()) {
            return "laptop with laptop Id: " + laptopId + " not found";
        }
        else  {
            iLaptopRepo.deleteById(laptopId);
            return "laptop with laptop Id: " +laptopId + " deleted successfully";
        }
    }
}
