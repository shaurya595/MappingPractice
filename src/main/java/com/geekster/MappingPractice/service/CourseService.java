package com.geekster.MappingPractice.service;

import com.geekster.MappingPractice.models.Address;
import com.geekster.MappingPractice.repositories.ICourseDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CourseService {
    @Autowired
    ICourseDao courseDao;
    public Address getCourseViaId(Integer id) {
        return courseDao.getById(id);
    }
}
