package com.geekster.MappingPractice.repositories;

import com.geekster.MappingPractice.models.Address;
import com.geekster.MappingPractice.models.Course;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ICourseDao extends CrudRepository<Course,Integer> {
    Address getById(Integer id);
}
