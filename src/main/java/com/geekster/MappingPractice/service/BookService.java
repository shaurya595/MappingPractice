package com.geekster.MappingPractice.service;

import com.geekster.MappingPractice.models.Address;
import com.geekster.MappingPractice.repositories.IBookDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookService {
    @Autowired
    static
    IBookDao bookDao;
    public static Address getBookById(Integer id) {
        return bookDao.getById(id);
    }
}
