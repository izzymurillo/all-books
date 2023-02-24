package com.izzy.books_api.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.izzy.books_api.models.Book;
import com.izzy.books_api.services.BookService;

@Controller
public class BookController {

  @Autowired // <-- takes care of dependency injections
  BookService bookService; // (connect to the service)

  @GetMapping("/")
  public String home() {
    return "redirect:/books";
  }

  // ========== READ ONE ==========
  @GetMapping("books/{id}")
  // in order to add to the View Model - add Model model
  // use @PathVariable for the id on url
  public String index(Model model, @PathVariable("id") Long id) {
    // set a book variable | find by id
    Book book = bookService.findBook(id);
    System.out.println(book);
    // in order to view on jsp
    model.addAttribute("book", book);
    return "show.jsp";

  }

}
