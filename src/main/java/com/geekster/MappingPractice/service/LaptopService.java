package com.geekster.MappingPractice.service;

import com.geekster.MappingPractice.models.Address;
import com.geekster.MappingPractice.repositories.ILaptopDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LaptopService {
    @Autowired
    ILaptopDao laptopDao;
    public Address getLaptopViaId(Integer id) {
        return laptopDao.getById(id);
    }
}
