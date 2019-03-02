package com.hikari.crud.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by hikari on 16/11/2018.
 */

@Table(name = "tb_lov")
@Entity
public class Lov {
    @Id
    private  String id;

    @Column
    private String lov_field;

    public Lov(String id, String lov_field) {
        this.id = id;
        this.lov_field = lov_field;
    }

    public Lov() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getLov_field() {
        return lov_field;
    }

    public void setLov_field(String lov_field) {
        this.lov_field = lov_field;
    }
}
