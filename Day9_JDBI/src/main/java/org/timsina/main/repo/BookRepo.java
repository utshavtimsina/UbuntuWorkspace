package org.timsina.main.repo;

import java.util.List;

import org.jdbi.v3.sqlobject.config.RegisterBeanMapper;
import org.jdbi.v3.sqlobject.statement.SqlQuery;
import org.timsina.main.model.Book;

public interface BookRepo {
	
	@SqlQuery("SELECT * FROM book")
	@RegisterBeanMapper(Book.class)
	public List<Book> getAllBooks();
}
