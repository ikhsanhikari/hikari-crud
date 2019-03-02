package com.hikari.crud.repository;

import com.hikari.crud.model.Employee;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by hikari on 18/11/2018.
 */
public interface EmployeeRepository extends CrudRepository<Employee,Integer>{
}
