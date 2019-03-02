package com.hikari.crud.repository;


import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;

import com.hikari.crud.model.Mahasiswa;

public interface MahasiswaRepository extends CrudRepository<Mahasiswa, String >{
	Page<Mahasiswa> findAll(Pageable pageable);	
	Mahasiswa findByNama(String nama);
}
