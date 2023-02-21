package com.izzy.books_api.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.izzy.books_api.models.Book;

public interface BookRepository extends CrudRepository<Book, Long>{
  List<Book> findAll();
  // CrudRepository == ORM ==> (comes with JPA) || Long is the ID
}
