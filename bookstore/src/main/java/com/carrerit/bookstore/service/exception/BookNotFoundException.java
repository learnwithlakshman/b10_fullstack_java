package com.carrerit.bookstore.service.exception;

public class BookNotFoundException extends RuntimeException {

	private static final long serialVersionUID = 3140660366881766766L;

	public BookNotFoundException(String message) {
		super(message);
	}
}
