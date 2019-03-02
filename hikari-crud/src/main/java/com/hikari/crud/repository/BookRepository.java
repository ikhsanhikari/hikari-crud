package com.hikari.crud.repository;

import com.hikari.crud.model.Book;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by hikari on 16/11/2018.
 */
public interface BookRepository extends CrudRepository<Book,String>{
}
