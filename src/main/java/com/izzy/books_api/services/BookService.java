// Services are the business logic of our app
package com.izzy.books_api.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.izzy.books_api.models.Book;
import com.izzy.books_api.repositories.BookRepository;

@Service //<== ANNOTATION for SERVICE REQUIRED for functionality
public class BookService {
  // LINK to the REPOSITORY vvvvvv
  @Autowired BookRepository bookRepo;

  public List<Book> getAll() {
    //talk to repo
    return bookRepo.findAll();
  }

  public Book newBook(Book book) {
    return bookRepo.save(book);
  }
}
