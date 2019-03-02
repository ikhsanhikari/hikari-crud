package com.hikari.crud.controller;

import com.google.common.collect.Lists;
import com.hikari.crud.core.JsonWrapper;
import com.hikari.crud.dto.LovDto;
import com.hikari.crud.dto.MahasiswaDto;
import com.hikari.crud.model.Mahasiswa;
import com.hikari.crud.model.Negara;
import com.hikari.crud.repository.NegaraRepository;
import com.hikari.crud.repository.TestRepositoryIface;
import com.hikari.crud.service.TestServiceIface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by hikari on 14/11/2018.
 */

@RestController
public class Test2Controller {
//    @Autowired
//    TestRepositoryIface testRepositoryIface;
    @Autowired
    NegaraRepository negaraRepository;
    @Autowired
    TestServiceIface testServiceIface;

    @Autowired
    TestRepositoryIface testRepositoryIface;

    @GetMapping("/test")
    public List<Mahasiswa> getMhs(){
        List<Mahasiswa> rslt = testRepositoryIface.getMahasiswa();

        return rslt;
    }

    @GetMapping("/test2")
    public JsonWrapper getMhsDto(){
        JsonWrapper rslt = testServiceIface.getMahasiswaDto();
        return rslt;
    }

    @GetMapping("/mahasiswa/criteria")
    public List<Mahasiswa> getMhsCriteria(){
        List<Mahasiswa> rslt = testRepositoryIface.getMahasiswaCriteria();
        return rslt;
    }

    @GetMapping("/lov/negara")
    public List<LovDto> lovNegara(){
        List<Negara>  listNegara= Lists.newArrayList(negaraRepository.findAll());
        List<LovDto> listResult = new ArrayList<>();
        for (Negara n: listNegara) {
            LovDto lov =  new LovDto();
            lov.setKey(n.getId());
            lov.setValue(n.getNegara());
            listResult.add(lov);
        }
        return  listResult;
    }


//    @ResponseBody
//    @GetMapping("/test")
//    public String getMhs(){
//        System.out.println("=============="+testRepositoryIface.getTest().get(0)[0].toString());
//        return "========"+testRepositoryIface.getTest().get(0)[1].toString();
//    }
}

