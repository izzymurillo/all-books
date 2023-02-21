package com.izzy.books_api.controllers;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.izzy.books_api.models.Book;
import com.izzy.books_api.services.BookService;

@Controller
public class MainController {

  // ArrayList<Book> books = new ArrayList<Book>();
  @Autowired
  BookService bookService;

  // ============  READ ALL  ============
  // (usually the root of the application)
  @RequestMapping("/")
  public String index(Model model) {
    List<Book> books = bookService.getAll();
    model.addAttribute("books", books);
    return "index.jsp";
  }

  // ============  CREATE  ============
  // (need 2 Routes - to Render & Post)
  // vvvvvvv RENDER vvvvvvv
  @RequestMapping("books/new")
  public String newBook(@ModelAttribute("book") Book book) {
    return "new.jsp";
  }

  // vvvvvvv POST vvvvvvv
  @PostMapping("/books")
  public String createBook(
      HttpSession session,
      // @RequestParam("title") String title,
      // @RequestParam("author") String author,
      // @RequestParam("pages") Integer pages
      @ModelAttribute("book") Book book) {
    // To make a book - create a new instance
    // Book book = new Book(title, author, pages);
    // System.out.println(book);
    // session.setAttribute("title", title);
    // session.setAttribute("author", author);
    // session.setAttribute("pages", pages);
        bookService.newBook(book);
    return "redirect:/";
  }

  // ============  READ ONE  ============

  // ============  UPDATE  ============

  // ============  DELETE  ============

}
