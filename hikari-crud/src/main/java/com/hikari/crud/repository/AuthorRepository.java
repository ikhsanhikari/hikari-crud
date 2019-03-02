package com.hikari.crud.repository;

import com.hikari.crud.model.Author;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by hikari on 22/11/2018.
 */
public interface AuthorRepository  extends CrudRepository<Author,Long>{
}
