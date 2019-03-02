package com.hikari.crud.service;

import com.hikari.crud.core.JsonWrapper;
import com.hikari.crud.dto.MahasiswaDto;
import com.hikari.crud.model.Mahasiswa;
import com.hikari.crud.repository.TestRepositoryIface;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.*;

/**
 * Created by hikari on 14/11/2018.
 */
@Service
@Transactional
public class TestService implements TestServiceIface{
    @Autowired
    TestRepositoryIface testRepositoryIface;

    private static SessionFactory factory;



    @Override
    public List<Map<String,Object>> getMahasiswa() {
        List<Object[]> listO = testRepositoryIface.getTest();
        List<Map<String,Object>> listResult = new ArrayList<>();
        for (Object[] listR: listO){
            Map<String,Object> map = new HashMap<>();
            map.put("nim",listR[0]);
            map.put("nama",listR[1]);
            listResult.add(map);
        }
        return listResult;
    }

    @Override
    public JsonWrapper getMahasiswaDto() {
        List<Object[]> listO = testRepositoryIface.getTest();
        List<MahasiswaDto> listDto =new ArrayList<>();
        for(Object[] listR:listO){
            MahasiswaDto mhs = new MahasiswaDto();
            mhs.setNim(listR[0].toString());
            mhs.setAlamat(listR[1].toString());
            mhs.setNama(listR[2].toString());
            mhs.setEmail(listR[3].toString());
            mhs.setNo_telp(listR[4].toString());
            listDto.add(mhs);
        }

        return new JsonWrapper(listDto,listDto.size(),"readMahasiswa");
    }



}
