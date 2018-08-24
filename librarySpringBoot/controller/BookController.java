package com.kg.librarySpringBoot.controller;

import org.springframework.web.bind.annotation.RequestBody;

import com.kg.librarySpringBoot.model.Book;
import com.kg.librarySpringBoot.repository.BookRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping(value = "/books")
public class BookController {
    @Autowired
    BookRepository bookRepository;

    @RequestMapping(method=RequestMethod.POST)
    public Book savebook(@RequestBody Book book)
    {
        return bookRepository.saveAndFlush(book);
    }
    @RequestMapping(method = RequestMethod.GET)
    public Iterable<Book> read() {
        return bookRepository.findAll();
    }
    @RequestMapping(value = "{bookid}", method = RequestMethod.PUT)
    public Book update(@PathVariable Long bookid, @RequestBody Book updatedBook) {
        updatedBook.setBookId(bookid);
        return bookRepository.saveAndFlush(updatedBook);
    }

    @RequestMapping(value = "{bookid}", method = RequestMethod.DELETE)
    // @ResponseStatus(HttpStatus.NO_CONTENT)
    void delete(@PathVariable Long bookid)
     {
        bookRepository.deleteById(bookid);
    }
}