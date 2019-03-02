package com.hikari.crud.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by hikari on 15/11/2018.
 */

@Entity
@Table(name = "negara")
public class Negara {
    @Id
    private String id;

    @Column
    private String negara;

    public Negara(String id, String negara) {
        this.id = id;
        this.negara = negara;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNegara() {
        return negara;
    }

    public void setNegara(String negara) {
        this.negara = negara;
    }

    public Negara() {
    }
}
