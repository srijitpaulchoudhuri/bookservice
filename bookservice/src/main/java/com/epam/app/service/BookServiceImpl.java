package com.epam.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.epam.app.customexception.NoBookFoundException;
import com.epam.app.dto.BookDto;
import com.epam.app.model.Book;
import com.epam.app.repository.BookRepository;

@Service
public class BookServiceImpl implements BookService{
	
	@Autowired
	private BookRepository bookRepository;

	@Override
	public Book add(BookDto bookDto) {
		Book book = new Book(bookDto.getTitle(), bookDto.getAuthor(), bookDto.getCategory(), bookDto.getPublisher());
		return bookRepository.save(book);
	}

	@Override
	public List<Book> getAll() {
		return bookRepository.findAll();
	}

	@Override
	public Book get(int id)throws NoBookFoundException {
		return bookRepository.findById(id).orElseThrow(NoBookFoundException::new);
	}

	@Override
	public void delete(int id) {
		bookRepository.deleteById(id);
		
	}

	@Override
	public Book update(int id, BookDto bookDto) {
		Book book = new Book(bookDto.getTitle(), bookDto.getAuthor(), bookDto.getCategory(), bookDto.getPublisher());
		book.setId(id);
		return bookRepository.save(book);
	}

	
	
	

	
}
