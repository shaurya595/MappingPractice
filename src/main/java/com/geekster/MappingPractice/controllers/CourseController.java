package com.geekster.MappingPractice.controllers;

import com.geekster.MappingPractice.models.Address;
import com.geekster.MappingPractice.models.Course;
import com.geekster.MappingPractice.repositories.IAddressDao;
import com.geekster.MappingPractice.repositories.ICourseDao;
import com.geekster.MappingPractice.service.AddressService;
import com.geekster.MappingPractice.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class CourseController {
    @Autowired
    ICourseDao courseDao;
    @Autowired
    CourseService courseService;

    @PostMapping(value = "/addCourse")
    public void saveCourse(@RequestBody Course course){
        courseDao.save(course);
    }
    @GetMapping(value = "/getCourse/{id}")
    public Address getCourseById(@RequestBody Integer id){
        return courseService.getCourseViaId(id);
    }
}
