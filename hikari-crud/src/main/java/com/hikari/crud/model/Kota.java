package com.hikari.crud.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by hikari on 23/11/2018.
 */
@Entity
@Table(name = "kota")
public class Kota {
    @Id
    private Integer id;

    @Column
    private String kota;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getKota() {
        return kota;
    }

    public void setKota(String kota) {
        this.kota = kota;
    }

    public Kota(Integer id, String kota) {
        this.id = id;
        this.kota = kota;
    }

    public Kota() {
    }
}
