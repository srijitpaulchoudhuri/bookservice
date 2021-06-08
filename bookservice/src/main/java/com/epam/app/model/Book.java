package com.epam.app.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="books")
@Getter
@Setter
@NoArgsConstructor
public class Book {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String  title;
	private String author;
	private String category;
	private String publisher;
	
	public Book(String title, String author, String category, String publisher) {
		this.title = title;
		this.author = author;
		this.category = category;
		this.publisher = publisher;
	}
	
	

}
