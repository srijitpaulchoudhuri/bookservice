package com.epam.app.cloud.contracts;

import org.junit.Before;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.cloud.contract.verifier.messaging.boot.AutoConfigureMessageVerifier;
import org.springframework.test.context.junit4.SpringRunner;

import com.epam.app.BookserviceApplication;
import com.epam.app.model.Book;
import com.epam.app.restcontroller.BookController;
import com.epam.app.service.BookService;

import io.restassured.module.mockmvc.RestAssuredMockMvc;

@RunWith(SpringRunner.class)
@AutoConfigureMessageVerifier
@SpringBootTest(classes = BookserviceApplication.class)
public class BaseContractTest {
	
	@MockBean
	private BookService bookService;
	@Autowired
	private BookController bookController;
	
	@Before
	public void setup() {
		
		RestAssuredMockMvc.config = RestAssuredMockMvc.config().mockMvcConfig(
				RestAssuredMockMvc.config().getMockMvcConfig().dontAutomaticallyApplySpringSecurityMockMvcConfigurer());
		RestAssuredMockMvc.standaloneSetup(bookController);
		Mockito.when(bookService.get(Mockito.anyInt())).thenReturn(getBookData());
	}
	private Book getBookData() {
		Book book = new Book("New Comics", "Gupta", "Comics", "DC Comics");
		book.setId(1);
		return book;
				
	}

}
