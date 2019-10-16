package org.famas.main.controller;

import org.famas.main.exception.BookNotFoundException;
import org.famas.main.model.Book;
import org.famas.main.service.BookService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/book")
public class BookController {
	BookService bookService;

	public BookController(BookService bookService) {
	//	super();
		this.bookService = bookService;
	}
	
	@GetMapping("/{bookId}")
	public Book getBookById(@PathVariable int bookId) throws BookNotFoundException{
		Book book = bookService.getBookById(bookId);
		if(book == null) {
			throw new BookNotFoundException("The Book With id "+bookId+" doesn't exists",HttpStatus.NOT_FOUND);
		}
		return bookService.getBookById(bookId);
	}
	
}
