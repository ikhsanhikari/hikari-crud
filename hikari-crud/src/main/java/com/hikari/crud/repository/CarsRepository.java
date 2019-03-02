package com.hikari.crud.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;

import com.hikari.crud.model.Cars;

public interface CarsRepository extends CrudRepository<Cars, String>{
	Page<Cars> findAll(Pageable pageable);	
	Cars findByVin(String vin);
}
