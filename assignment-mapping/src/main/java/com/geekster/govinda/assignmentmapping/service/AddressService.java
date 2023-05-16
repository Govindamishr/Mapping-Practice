package com.geekster.govinda.assignmentmapping.service;

import com.geekster.govinda.assignmentmapping.model.Address;
import com.geekster.govinda.assignmentmapping.model.Student;
import com.geekster.govinda.assignmentmapping.repository.IAddressRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service

public class AddressService {
    @Autowired
    IAddressRepo addressRepo;
    public String  saveAddress(Address address) {
        addressRepo.save(address);
        return "Updated successFully";
    }

    public List<Address> getAllAddress() {
        List<Address> allAddress=addressRepo.findAll();
        return allAddress;
    }

    public Optional<Address> getAddressById(Long addressId) {
        return addressRepo.findById(addressId);
    }

    public String updateAddress(Long addressId, Address address) {
        Optional<Address> addressUpdate = addressRepo.findById(addressId);
        address.setAddressId(addressId);
        if (addressUpdate.isEmpty()) {
            return "Address with Id: " + addressUpdate + " not found";
        }
        else  {
            addressRepo.save(address);
            return "Address with  Id: " + addressId + " updated successfully";
        }

    }

    public String deleteById(Long addressId) {

        Optional<Address> address = addressRepo.findById(addressId);
        if (address.isEmpty()) {
            return "Address with  Id: " + addressId + " not found";
        }
        else  {
            addressRepo.deleteById(addressId);
            return "Address with  Id: " + addressId + " deleted successfully";
        }
    }
}
