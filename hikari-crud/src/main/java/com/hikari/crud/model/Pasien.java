package com.hikari.crud.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.sql.Date;

/**
 * Created by hikari on 18/11/2018.
 */

@Entity
@Table(name = "pasien")
public class Pasien {
    @Id
    private String id;

    @Column
    private String nama;

    @Column
    private String alamat;

    @Column
    private String no_telp;

    @Column
    private Date tgl_lahir;

    @Column
    private  Date tgl_daftar;

    public Pasien(String id, String nama, String alamat, String no_telp, Date tgl_lahir, Date tgl_daftar) {
        this.id = id;
        this.nama = nama;
        this.alamat = alamat;
        this.no_telp = no_telp;
        this.tgl_lahir = tgl_lahir;
        this.tgl_daftar = tgl_daftar;
    }

    public Pasien() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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

    public String getNo_telp() {
        return no_telp;
    }

    public void setNo_telp(String no_telp) {
        this.no_telp = no_telp;
    }

    public Date getTgl_lahir() {
        return tgl_lahir;
    }

    public void setTgl_lahir(Date tgl_lahir) {
        this.tgl_lahir = tgl_lahir;
    }

    public Date getTgl_daftar() {
        return tgl_daftar;
    }

    public void setTgl_daftar(Date tgl_daftar) {
        this.tgl_daftar = tgl_daftar;
    }
}
