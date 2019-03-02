package com.hikari.crud.repository;

import com.hikari.crud.model.Category;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by hikari on 16/11/2018.
 */
public interface CategoryRepository  extends CrudRepository<Category,String>{
}
