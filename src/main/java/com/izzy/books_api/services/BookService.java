// Services are the business logic of our app
package com.izzy.books_api.services;

import java.util.List;
import java.util.Optional;

// import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.izzy.books_api.models.Book;
import com.izzy.books_api.repositories.BookRepository;

@Service
public class BookService {
  // adding the book repository as a dependency
  private final BookRepository bookRepository;

  public BookService(BookRepository bookRepository) {
    this.bookRepository = bookRepository;
  }

  // returns all the books
  public List<Book> allBooks() {
    return bookRepository.findAll();
  }

  // creates a book
  public Book createBook(Book book) {
    return bookRepository.save(book);
  }

  // retrieves a book
  public Book findBook(Long id) {
    Optional<Book> optionalBook = bookRepository.findById(id);
    if (optionalBook.isPresent()) {
      return optionalBook.get();
    } else {
      return null;
    }
  }

  // updates a book
  // EXACTLY THE SAME AS CREATE
  public Book updateBook(Book book) {
    return bookRepository.save(book);
  }

  // deletes a book
  public void deleteBook(Long id) {
    bookRepository.deleteById(id);
  }

}
