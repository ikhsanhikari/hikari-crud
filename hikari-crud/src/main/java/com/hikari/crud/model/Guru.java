package com.hikari.crud.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by hikari on 14/11/2018.
 */

@Entity
@Table(name="guru")
public class Guru {

    @Id
    private String nid;

    @Column
    private String nama;

    @Column
    private String alamat;

    public String getNid() {
        return nid;
    }

    public void setNid(String nid) {
        this.nid = nid;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public Guru(String nid, String nama, String alamat) {
        this.nid = nid;
        this.nama = nama;
        this.alamat = alamat;
    }

    public Guru() {
    }
}
