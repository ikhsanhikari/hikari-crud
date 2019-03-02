package com.hikari.crud.core;

import com.google.common.collect.Lists;
import com.hikari.crud.dto.ColumnDto;
import com.hikari.crud.exception.ResourceNotFoundException;
import com.hikari.crud.model.Cars;
import com.hikari.crud.model.Mahasiswa;
import com.hikari.crud.model.Menu;
import com.hikari.crud.repository.CarsRepository;
import com.hikari.crud.repository.TestRepositoryIface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.Table;
import java.lang.reflect.ParameterizedType;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by hikari on 16/11/2018.
 */

public abstract   class JspBaseController<T,ID>{

    Class<T> persistentClass ;
    public String nama_table;

    public JspBaseController() {
        this.persistentClass = (Class<T>)
                ((ParameterizedType)getClass().getGenericSuperclass())
                        .getActualTypeArguments()[0];
         this.nama_table = this.persistentClass.getAnnotation(Table.class).name().toLowerCase();
    }

    @Autowired
    JspRepository jspBaseController;

    @Autowired
    CrudRepository<T,ID> baseRepository;

    @Autowired
    TestRepositoryIface testRepositoryIface;


    @RequestMapping(value = "/view",method = RequestMethod.GET)
    public String index(ModelMap map ){
        List<ColumnDto> colDto = jspBaseController.getColumn(nama_table);

        List<T> list = Lists.newArrayList(baseRepository.findAll());
        map.addAttribute("judul",nama_table);
        map.addAttribute("column",colDto);
        map.addAttribute("field",list);

        List<Menu> listMenu = testRepositoryIface.getMenu();
        map.addAttribute("global_menu",listMenu);

        return nama_table+"/view";

    }

    @RequestMapping(value = "/form",method = RequestMethod.GET)
    public String tambah_data(T t, ModelMap map ){
        List<ColumnDto> colDto = jspBaseController.getColumn(nama_table);
        map.addAttribute("column",colDto);
        map.addAttribute(nama_table,t);
        map.addAttribute("judul",nama_table);

        List<Menu> listMenu = testRepositoryIface.getMenu();
        map.addAttribute("global_menu",listMenu);

        return nama_table+"/form";
    }

    @RequestMapping(value = "/save_data",method = RequestMethod.POST)
    public String save_data(T t){
        baseRepository.save(t);
        return "redirect:view";
    }

    @RequestMapping(value = "/view/{id}",method = RequestMethod.GET)
    public String viewById(@PathVariable(value = "id") ID id,ModelMap map,T t){
        t = baseRepository.findById(id).orElseThrow(()-> new ResourceNotFoundException("Test","Test",id));
        map.addAttribute(nama_table,t);
        List<ColumnDto> colDto = jspBaseController.getColumn(nama_table);
        map.addAttribute("column",colDto);
        map.addAttribute("judul",nama_table);

        List<Menu> listMenu = testRepositoryIface.getMenu();
        map.addAttribute("global_menu",listMenu);

        return nama_table+"/form";
    }

    @RequestMapping(value = "/delete/{id}",method = RequestMethod.GET)
    public String deleteById(@PathVariable(value = "id") ID id,ModelMap map,T t){
        t = baseRepository.findById(id).orElseThrow(()-> new ResourceNotFoundException("Test","Test",id));
        baseRepository.delete(t);
        return "redirect:http://localhost:8080/"+nama_table+"/view";
    }
}
