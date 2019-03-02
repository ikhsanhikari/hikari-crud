package com.hikari.crud.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.Repository;
import org.springframework.data.repository.query.Param;

import com.hikari.crud.model.Mahasiswa;

public interface MahasiswaJPARepository extends Repository<Mahasiswa,String>{
	@Query(value = "select * from mahasiswa  where nama = :cari ", nativeQuery = true)
    public List<Mahasiswa> getNamaMahasiswa(@Param("cari") String cari);

}
