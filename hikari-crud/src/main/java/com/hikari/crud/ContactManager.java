package com.hikari.crud;

/**
 * Created by hikari on 15/11/2018.
 */
import java.io.Serializable;
import java.util.List;

import com.hikari.crud.model.Contact;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;

import javax.persistence.Query;

public class ContactManager {
    public static void main(String[] args) {
        Configuration cfg = new Configuration();
        cfg.configure("/hibernate.cfg.xml");

        SessionFactory factory = cfg.buildSessionFactory();
        Session session = factory.openSession();
        Contact c = new Contact();
        c.setName("Mukesh");
        c.setAddress("===");
        c.setId(1);
        c.setTelephone("---------------");

        Transaction tx = session.beginTransaction();
        session.save(c);
        Query q = session.createQuery("select Model from Contact Model");
        List<Contact> caa = q.getResultList();
        for (Contact ccc: caa) {
            System.out.println("]]]]]]]]]]ppppppppppppppppp"+ccc.getName());
        }
        System.out.println("Object saved successfully.....!!");
        tx.commit();
        session.close();
        factory.close();
        System.out.println("Test");
    }
}
