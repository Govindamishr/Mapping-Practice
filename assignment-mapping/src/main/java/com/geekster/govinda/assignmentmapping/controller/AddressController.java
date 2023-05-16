package com.geekster.govinda.assignmentmapping.controller;

import com.geekster.govinda.assignmentmapping.model.Address;
import com.geekster.govinda.assignmentmapping.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/address")

public class AddressController {

    @Autowired
    AddressService addressService;

    @PostMapping("/addAddress")

    public String  saveAddress(@RequestBody Address address){
        addressService.saveAddress(address);
        return "Address Saved SuccessFully";
    }
    @GetMapping("/getAddress")

    public List<Address> getAllAddress(){
        return addressService.getAllAddress();

    }
    @GetMapping("/addressById{addressId}")

    public Optional<Address> getById(@PathVariable Long addressId){
        return addressService.getAddressById(addressId);
    }
    @PutMapping("/addressUpdate/{addressId}")

    public String updateAddress(@PathVariable Long addressId,@RequestBody Address address){
        return addressService.updateAddress(addressId,address);
    }
    @DeleteMapping("/deleteBy{addressId}")

    public String deleteById(@PathVariable Long addressId){

        return addressService.deleteById(addressId);

    }
}
