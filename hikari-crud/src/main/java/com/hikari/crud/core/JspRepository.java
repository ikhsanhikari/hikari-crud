package com.hikari.crud.core;

import com.hikari.crud.dto.ColumnDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.Table;
import java.lang.reflect.ParameterizedType;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by hikari on 16/11/2018.
 */

@Repository
public class JspRepository{

    @Autowired
    EntityManager em ;


    public List<ColumnDto> getColumn(String table){
        Query q = em.createNativeQuery("SHOW FULL COLUMNS FROM "+table);
        List<Object[]> column = q.getResultList();
        List<ColumnDto> listResult = new ArrayList<>();
        for (Object[] obj  : column){
            ColumnDto dto = new ColumnDto();
            dto.setColumn(obj[0].toString());
            dto.setType(obj[1].toString());
            dto.setComment(obj[8].toString());
            listResult.add(dto);
        }
        return listResult;
    }

}
