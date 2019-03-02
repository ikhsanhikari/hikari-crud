package com.hikari.crud.repository;

import com.hikari.crud.dto.MahasiswaDto;
import com.hikari.crud.model.Mahasiswa;
import com.hikari.crud.model.Menu;

import java.util.List;

/**
 * Created by hikari on 14/11/2018.
 */
public interface TestRepositoryIface {
    public List<Object[]> getTest();
    public List<Mahasiswa> getMahasiswa();
    public List<Mahasiswa> getMahasiswaCriteria();
    public List<Menu> getMenu();

}
