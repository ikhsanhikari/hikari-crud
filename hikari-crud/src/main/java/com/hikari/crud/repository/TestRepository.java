package com.hikari.crud.repository;

import com.hikari.crud.dto.MahasiswaDto;
import com.hikari.crud.model.Mahasiswa;
import com.hikari.crud.model.Menu;
import org.aspectj.weaver.ast.Test;
import org.hibernate.*;
import org.hibernate.cfg.Configuration;
import org.hibernate.transform.Transformers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import java.util.Iterator;
import java.util.List;

/**
 * Created by hikari on 14/11/2018.
 */

@Repository
public class TestRepository implements TestRepositoryIface {



    @Autowired
    EntityManager em;

    @Override
    public List<Object[]> getTest(){
        Query q = em.createNativeQuery("SELECT * from mahasiswa  ");
        List<Object[]> authors = q.getResultList();
        return authors;
    }

    @Override
    public List<Mahasiswa> getMahasiswa(){
        Query q = em.createQuery("select Model From Mahasiswa Model");
        List<Mahasiswa> list = q.getResultList();
        return list;
    }

    @Override
    public List<Menu> getMenu(){
        Query q = em.createQuery("select Model From Menu Model");
        List<Menu> list = q.getResultList();
        return list;
    }

    @Override
    public List<Mahasiswa> getMahasiswaCriteria(){
        CriteriaBuilder cb = em.getCriteriaBuilder();

        CriteriaQuery<Mahasiswa> q = cb.createQuery(Mahasiswa.class);
        Root<Mahasiswa> c = q.from(Mahasiswa.class);
        q.select(c);

        TypedQuery<Mahasiswa> query = em.createQuery(q);
        List<Mahasiswa> results = query.getResultList();
        return results;
    }

//    public int saveMahasiswa(Mahasiswa mahasiswa){
//
//    }


}
