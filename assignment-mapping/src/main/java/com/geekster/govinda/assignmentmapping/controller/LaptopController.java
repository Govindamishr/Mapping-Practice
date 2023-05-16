package com.geekster.govinda.assignmentmapping.controller;

import com.geekster.govinda.assignmentmapping.model.Address;
import com.geekster.govinda.assignmentmapping.model.Laptop;
import com.geekster.govinda.assignmentmapping.service.LaptopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/laptop")

public class LaptopController {
    @Autowired
    LaptopService laptopService;
    @PostMapping("/addLaptop")

    public String addLaptop(@RequestBody List<Laptop> laptop){
       laptopService.addLaptop(laptop);
        return"Added Laptop SuccessFully";

    }
    @GetMapping("/getLaptop")

    public List<Laptop> getAllLaptop(){
        return laptopService.getAllLaptop();

    }
    @DeleteMapping("/deleteBy/{laptopId}")

    public String deleteById(@PathVariable Long laptopId){

        return laptopService.deleteById(laptopId);

    }



}
