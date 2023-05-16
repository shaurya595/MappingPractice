package com.geekster.MappingPractice.repositories;

import com.geekster.MappingPractice.models.Address;
import com.geekster.MappingPractice.models.Laptop;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ILaptopDao extends CrudRepository<Laptop,Integer> {
    Address getById(Integer id);

}
