package com.hikari.crud.service;

import com.hikari.crud.core.JsonWrapper;
import com.hikari.crud.dto.MahasiswaDto;

import java.util.List;
import java.util.Map;

/**
 * Created by hikari on 14/11/2018.
 */
public interface TestServiceIface {

    public List<Map<String,Object>> getMahasiswa();
    public JsonWrapper getMahasiswaDto();

}
