package com.carrerit.bookstore.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.carrerit.bookstore.domain.Book;

public interface BookRepo extends JpaRepository<Book, Long> {

	@Query(value = "select b from Book b where title like %?1%")
	List<Book> search(String str);

}
