package com.carrerit.bookstore.service;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

import com.carrerit.bookstore.domain.Book;
import com.carrerit.bookstore.repo.BookRepo;
import com.carrerit.bookstore.service.exception.BookNotFoundException;

@Service
public class BookServiceImpl implements BookService {

	private Logger log = LoggerFactory.getLogger(BookServiceImpl.class);

	private final BookRepo bookRepo;

	@Autowired
	public BookServiceImpl(BookRepo bookRepo) {
		this.bookRepo = bookRepo;
	}

	@Override
	public Book addBook(Book book) {
		Assert.notNull(book, "Book can't be null");
		Book savedBook = bookRepo.save(book);
		log.info("Book with id {} is saved", savedBook.getBid());
		return savedBook;
	}

	@Override
	public List<Book> getBooks() {
		List<Book> books = bookRepo.findAll();
		log.info("Total {} books found in db", books.size());
		return books;
	}

	@Override
	public Book getBook(Long id) {
		Assert.notNull(id, "Id can't be null or empty");

		Optional<Book> optBook = bookRepo.findById(id);
		if (optBook.isPresent()) {
			Book book = optBook.get();
			log.info("Book with id {} has title {}", book.getBid(), book.getTitle());
			return book;
		} else {
			log.info("Book with id :{} is not found", id);
		}
		throw new BookNotFoundException(String.format("Book with id : %s is not found", id));
	}

	@Override
	public List<Book> search(String str) {

		List<Book> books = bookRepo.search(str);
		log.info("For given search str :{} total books found {}", str, books.size());
		return books;
	}

	@Override
	public boolean removeBook(Long id) {
		Assert.notNull(id, "Id can't be null or empty");

		Optional<Book> optBook = bookRepo.findById(id);
		if (optBook.isPresent()) {
			Book book = optBook.get();
			log.info("Book with id {} has title {} is removed", book.getBid(), book.getTitle());
			bookRepo.delete(book);
			return true;
		} else {
			log.info("Book with id :{} is not found", id);
		}
		throw new BookNotFoundException(String.format("Book with id : %s is not found", id));
	}

	@Override
	public Book updateBook(Book book) {
		Book ebook = bookRepo.findById(book.getBid()).get();
		log.info("Book before update with title {} author {} price {}", ebook.getTitle(), ebook.getAuthor(),
				ebook.getPrice());
		Book ubook = bookRepo.save(book);
		log.info("Book is updated with title {} author {} price {}", ubook.getTitle(), ubook.getAuthor(),
				ubook.getPrice());
		return ubook;
	}

}
