package com.geekster.MappingPractice.repositories;

import com.geekster.MappingPractice.models.Address;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IAddressDao extends CrudRepository<Address,Integer> {
    Address getById(Integer id);



}
