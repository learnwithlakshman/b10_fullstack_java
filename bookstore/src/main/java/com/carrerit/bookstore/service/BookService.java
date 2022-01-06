package com.carrerit.bookstore.service;

import java.util.List;

import com.carrerit.bookstore.domain.Book;

public interface BookService {
	
		public Book addBook(Book book);
		public Book getBook(Long id);
		public List<Book> getBooks();
		public List<Book> search(String str);
		public boolean removeBook(Long id);
		public Book updateBook(Book book);

}
