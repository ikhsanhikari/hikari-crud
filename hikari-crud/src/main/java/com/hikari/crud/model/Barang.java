package com.hikari.crud.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.sql.Date;

/**
 * Created by hikari on 21/11/2018.
 */

@Entity
@Table(name = "barang")
public class Barang {
    @Id
    private String id_barang;

    @Column
    private String nama_barang;

    @Column
    private String jenis_barang;

    @Column
    private String berat_barang;

    @Column
    private Date tgl_exfired;

    public Barang() {
    }

    public Barang(String id_barang, String nama_barang, String jenis_barang, String berat_barang, Date tgl_exfired) {
        this.id_barang = id_barang;
        this.nama_barang = nama_barang;
        this.jenis_barang = jenis_barang;
        this.berat_barang = berat_barang;
        this.tgl_exfired = tgl_exfired;
    }

    public String getId_barang() {
        return id_barang;
    }

    public void setId_barang(String id_barang) {
        this.id_barang = id_barang;
    }

    public String getNama_barang() {
        return nama_barang;
    }

    public void setNama_barang(String nama_barang) {
        this.nama_barang = nama_barang;
    }

    public String getJenis_barang() {
        return jenis_barang;
    }

    public void setJenis_barang(String jenis_barang) {
        this.jenis_barang = jenis_barang;
    }

    public String getBerat_barang() {
        return berat_barang;
    }

    public void setBerat_barang(String berat_barang) {
        this.berat_barang = berat_barang;
    }

    public Date getTgl_exfired() {
        return tgl_exfired;
    }

    public void setTgl_exfired(Date tgl_exfired) {
        this.tgl_exfired = tgl_exfired;
    }
}
