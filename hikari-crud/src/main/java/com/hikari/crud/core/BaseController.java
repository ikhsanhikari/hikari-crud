package com.hikari.crud.core;

import com.google.common.collect.Lists;
import com.hikari.crud.exception.ResourceNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.lang.reflect.ParameterizedType;
import java.util.List;

/**
 * Created by hikari on 14/11/2018.
 */



public abstract class BaseController<T,ID> {

    @Autowired
    CrudRepository<T,ID> baseRepository;

    Class<T> persistentClass;
    String path;

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public BaseController() {
        this.persistentClass = (Class<T>)
                ((ParameterizedType)getClass().getGenericSuperclass())
                        .getActualTypeArguments()[0];
        this.path=this.persistentClass.getSimpleName().toLowerCase();
    }

    @GetMapping(value = "/readAll")
    public JsonWrapper readAll(){
        List<T> result = Lists.newArrayList(baseRepository.findAll());
        int size = result.size();
        return new JsonWrapper(result,result.size(),"readAll data "+this.path);
    }

    @PostMapping("/save")
    public JsonWrapper save(@RequestBody T t){
         baseRepository.save(t);
         return  new JsonWrapper(null,0,"save");

    }

    @GetMapping("/readById/{id}")
    public JsonWrapper readById(@PathVariable(value = "id") ID id){
        T t = baseRepository.findById(id).orElseThrow(()-> new ResourceNotFoundException("Test","Test",id));
        return new JsonWrapper(t,1,"Read By Id");
    }

    @DeleteMapping("/delete/{id}")
    public JsonWrapper delete(@PathVariable(value = "id") ID id){
        T t = baseRepository.findById(id).orElseThrow(()-> new ResourceNotFoundException("Test","Test",id));
        baseRepository.delete(t);
        return new JsonWrapper(null,0,"delete");
    }

}
