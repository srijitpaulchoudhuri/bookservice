package com.epam.app.service;

import java.util.List;

import com.epam.app.customexception.NoBookFoundException;
import com.epam.app.dto.BookDto;
import com.epam.app.model.Book;

public interface BookService {
	
	public Book add(BookDto bookDto);
	public List<Book> getAll();
	public Book get(int id)throws NoBookFoundException;
	public void delete(int id);
	public Book update(int id,BookDto bookDto);

}
