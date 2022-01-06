package com.carrerit.bookstore.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.carrerit.bookstore.domain.Book;
import com.carrerit.bookstore.service.BookService;

@RestController
@RequestMapping("/book")
public class BookController {

	private final BookService bookService;

	@Autowired
	public BookController(BookService bookService) {
		this.bookService = bookService;
	}

	@PostMapping("/addnew")
	public Book addBook(@RequestBody Book book) {
		return bookService.addBook(book);
	}
	
	@GetMapping("/all")
	public List<Book> getBooks(){
		 return bookService.getBooks();
	}
	
	@DeleteMapping("/remove/{bid}")
	public boolean removeBook(@PathVariable("bid")Long id){
		 return bookService.removeBook(id);
	}
	
	@GetMapping("/getbook/{bid}")
	public Book getBook(@PathVariable("bid")Long id){
		 return bookService.getBook(id);
	}
	
	@GetMapping("/search")
	public List<Book> removeBook(@RequestParam("str")String str){
		 return bookService.search(str);
	}
	@PutMapping("/update")
	public Book updateBook(@RequestBody Book book) {
		return bookService.updateBook(book);
	}
}
