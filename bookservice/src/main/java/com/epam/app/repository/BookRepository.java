package com.epam.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.epam.app.model.Book;

public interface BookRepository extends JpaRepository<Book, Integer>{

}
