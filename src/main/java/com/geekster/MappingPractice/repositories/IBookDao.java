package com.geekster.MappingPractice.repositories;

import com.geekster.MappingPractice.models.Address;
import com.geekster.MappingPractice.models.Book;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IBookDao extends CrudRepository<Book,Integer> {
    Address getById(Integer id);

}
