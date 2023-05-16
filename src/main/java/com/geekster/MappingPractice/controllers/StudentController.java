package com.geekster.MappingPractice.controllers;

import com.geekster.MappingPractice.models.Address;
import com.geekster.MappingPractice.models.Student;
import com.geekster.MappingPractice.repositories.IAddressDao;
import com.geekster.MappingPractice.repositories.IStudentDao;
import com.geekster.MappingPractice.service.AddressService;
import com.geekster.MappingPractice.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class StudentController {
    @Autowired
    IStudentDao studentDao;
    @Autowired
    StudentService studentService;

    @PostMapping(value = "/addStudent")
    public void saveStudent(@RequestBody Student student) {
        studentDao.save(student);
    }

    @GetMapping(value = "/getStudent/{id}")
    public Address getStudentById(@RequestBody Integer id) {
        return studentService.getStudentViaId(id);
    }
    @DeleteMapping(value="/deleteStudent/{id}")
    public void DeleteStudentById(@PathVariable Integer id){
        StudentService.removeStudentById(id);
    }
}
