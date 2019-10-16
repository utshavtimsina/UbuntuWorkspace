package org.famas.main.repository;

import org.famas.main.model.Book;
import org.jdbi.v3.sqlobject.config.RegisterBeanMapper;
import org.jdbi.v3.sqlobject.customizer.Bind;
import org.jdbi.v3.sqlobject.statement.SqlQuery;

public interface BookRepository {
	@SqlQuery("SELECT * FROM book WHERE id = :bookId")
	@RegisterBeanMapper(Book.class)
	public Book getBookById(@Bind int bookId);
}
