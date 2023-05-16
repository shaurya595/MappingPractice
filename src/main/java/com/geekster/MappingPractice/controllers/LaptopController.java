package com.geekster.MappingPractice.controllers;

import com.geekster.MappingPractice.models.Address;
import com.geekster.MappingPractice.models.Laptop;
import com.geekster.MappingPractice.repositories.IAddressDao;
import com.geekster.MappingPractice.repositories.ICourseDao;
import com.geekster.MappingPractice.repositories.ILaptopDao;
import com.geekster.MappingPractice.service.AddressService;
import com.geekster.MappingPractice.service.LaptopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LaptopController {
    @Autowired
    ILaptopDao laptopDao;
    @Autowired
    LaptopService laptopService;

    @PostMapping(value = "/addLaptop")
    public void saveLaptop(@RequestBody Laptop laptop){
        laptopDao.save(laptop);
    }
    @GetMapping(value = "/getLaptop/{id}")
    public Address getLaptopById(@RequestBody Integer id){
        return laptopService.getLaptopViaId(id);
    }
}
