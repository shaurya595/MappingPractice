package com.geekster.MappingPractice.controllers;

import com.geekster.MappingPractice.models.Address;
import com.geekster.MappingPractice.repositories.IAddressDao;
import com.geekster.MappingPractice.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class AddressController {
    @Autowired
    IAddressDao addressDao;
    @Autowired
    AddressService addressService;

    @PostMapping(value = "/addAddress")
    public void saveAddress(@RequestBody Address address){
        addressDao.save(address);
    }
    @GetMapping(value = "/getAddress/{id}")
    public Address getAddressById(@RequestBody Integer id){
        return AddressService.getAddressViaId(id);
    }
    @DeleteMapping(value="/deleteAddress/{id}")
    public void DeleteAddresstById(@PathVariable Integer id){
        AddressService.removeAddressById(id);
    }

}
