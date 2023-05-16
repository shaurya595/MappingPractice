package com.geekster.MappingPractice.repositories;

import com.geekster.MappingPractice.models.Address;
import com.geekster.MappingPractice.models.Student;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IStudentDao extends CrudRepository<Student,Integer> {
    Address getById(Integer id);
}
