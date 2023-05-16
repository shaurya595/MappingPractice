package com.geekster.MappingPractice.controllers;

import com.geekster.MappingPractice.models.Address;
import com.geekster.MappingPractice.models.Book;
import com.geekster.MappingPractice.repositories.IAddressDao;
import com.geekster.MappingPractice.repositories.IBookDao;
import com.geekster.MappingPractice.service.AddressService;
import com.geekster.MappingPractice.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookController {
    @Autowired
    IBookDao bookDao;
    @Autowired
    BookService bookService;

    @PostMapping(value = "/addBooks")
    public void saveBooks(@RequestBody Book book){
        bookDao.save(book);
    }
    @GetMapping(value = "/getBooks/{id}")
    public Address getBooksById(@RequestBody Integer id){
        return BookService.getBookById(id);
    }
}
