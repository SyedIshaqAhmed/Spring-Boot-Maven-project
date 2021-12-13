package com.boot.demo.database;

import org.springframework.data.repository.CrudRepository;

import com.boot.demo.pojo.Author;

public interface AuthorRepository extends CrudRepository<Author, Integer> {

}
