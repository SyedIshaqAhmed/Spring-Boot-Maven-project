package com.boot.demo.database;

import org.springframework.data.repository.CrudRepository;

import com.boot.demo.pojo.Book;

public interface BookRepository extends CrudRepository<Book, Integer> {

}
