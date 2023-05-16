package com.geekster.MappingPractice.service;

import com.geekster.MappingPractice.models.Address;
import com.geekster.MappingPractice.repositories.IBookDao;
import com.geekster.MappingPractice.repositories.IStudentDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;

@Service
public class StudentService {
    @Autowired
    static
    IStudentDao studentDao;

    public static void removeStudentById(Integer id) {
        studentDao.deleteAllById(Collections.singleton(id));
    }

    public Address getStudentViaId(Integer id) {
        return studentDao.getById(id);
    }
}
