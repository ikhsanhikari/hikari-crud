package com.hikari.crud.core;

import com.google.common.collect.Lists;
import com.hikari.crud.dto.LovDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.web.bind.annotation.GetMapping;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.Table;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by hikari on 16/11/2018.
 */
public class LOVController<T> {

    @Autowired
    EntityManager em;



//    @Autowired
//    CrudRepository<T,ID> baseRepository;
//
    Class<T> persistentClass;
//
    public LOVController() {
        this.persistentClass = (Class<T>)
                ((ParameterizedType)getClass().getGenericSuperclass())
                        .getActualTypeArguments()[0];
    }

    @GetMapping("/lov")
    public JsonWrapper getLov(){
        Query q = em.createNativeQuery("SELECT * from   "+this.persistentClass.getAnnotation(Table.class).name());
        List<Object[]> authors = q.getResultList();

        List<LovDto> listDto = new ArrayList<>();
        for (Object[] obj: authors) {
            LovDto lov = new LovDto();
            lov.setKey(obj[0].toString());
            lov.setValue(obj[1].toString());
            listDto.add(lov);
        }
        return new JsonWrapper(listDto,listDto.size(),"Lov Hungkul");
    }
//
//
//
//    @GetMapping(value = "/lov")
//    public JsonWrapper lOV(){
//
//        try {
//            Class noparams[] = {};
//            Class[] paramString = new Class[1];
//            paramString[0] = String.class;
//
//
//            Class cls = Class.forName("com.hikari.crud.model."+this.persistentClass.getSimpleName());
//            Object obj = cls.newInstance();
//
//            Method method = cls.getDeclaredMethod("set"+this.persistentClass.getSimpleName(), paramString);
//            method.invoke(obj,new String("Hikari"));
//
//            method = cls.getDeclaredMethod("get"+this.persistentClass.getSimpleName(), noparams);
////            method.invoke(obj,null);
//
//            List<T> result = Lists.newArrayList(baseRepository.findAll());
//            List<LovDto> listLov = new ArrayList<>();
//
//            for (T t:result) {
//                LovDto lov = new LovDto();
//                lov.setKey(method.invoke(obj, null).toString());
//                lov.setValue(this.persistentClass.getAnnotations().toString());
//                listLov.add(lov);
//            }
//
//
//
//
//            int size = result.size();
//            return new JsonWrapper(listLov,result.size(),"Lov Data");
//
//
//        }catch (IllegalAccessException e) {
//            e.printStackTrace();
//        } catch (InstantiationException e) {
//            e.printStackTrace();
//        } catch (ClassNotFoundException e) {
//            e.printStackTrace();
//        } catch (InvocationTargetException e) {
//            e.printStackTrace();
//        } catch (NoSuchMethodException e) {
//            e.printStackTrace();
//        }
//
//
//    return null;
//    }
//




}
