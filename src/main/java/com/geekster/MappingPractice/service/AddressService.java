package com.geekster.MappingPractice.service;

import com.geekster.MappingPractice.models.Address;
import com.geekster.MappingPractice.repositories.IAddressDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;

import static com.fasterxml.jackson.databind.type.LogicalType.Collection;

@Service
public class AddressService {
    @Autowired
    static
    IAddressDao addressDao;
    public static Address getAddressViaId(Integer id) {
        return addressDao.getById(id);
    }


    public static void removeAddressById(Integer id) {
        addressDao.deleteAllById(Collections.singleton(id));
    }
}
