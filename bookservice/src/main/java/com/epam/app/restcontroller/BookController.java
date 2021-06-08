package com.epam.app.restcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.epam.app.dto.BookDto;
import com.epam.app.model.Book;
import com.epam.app.service.BookService;

@RestController
@RequestMapping("/api/books")
public class BookController {
	
	@Autowired
	private BookService bookService;
	
	@PostMapping
	public ResponseEntity<Book> add(@RequestBody BookDto book){
		return new ResponseEntity<>(bookService.add(book),HttpStatus.CREATED);
	}
	@GetMapping
	public ResponseEntity<List<Book>> getAll(){
		return new ResponseEntity<>(bookService.getAll(),HttpStatus.OK);
	}
	@GetMapping("/{id}")
	public ResponseEntity<Book> get(@PathVariable int id){
		return new ResponseEntity<>(bookService.get(id),HttpStatus.OK);

	}
	@DeleteMapping("/{id}")
	public ResponseEntity<Object> delete(@PathVariable int id){
		bookService.delete(id);
		return new ResponseEntity<>(HttpStatus.NO_CONTENT);
	}
	@PutMapping("/{id}")
	public ResponseEntity<Book> update(@PathVariable int id,@RequestBody BookDto book){
		return new ResponseEntity<>(bookService.update(id, book),HttpStatus.OK);

	}
}
