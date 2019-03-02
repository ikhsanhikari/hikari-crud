package com.hikari.crud.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="mahasiswa")
public class Mahasiswa {
	@Id
	private String nim;
	
	@Column
	private String nama;
	
	@Column
	private String alamat;

	@Column
	private String email;
	
	@Column
	private String no_telp;

	public String getNim() {
		return nim;
	}

	public void setNim(String nim) {
		this.nim = nim;
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getNo_telp() {
		return no_telp;
	}

	public void setNo_telp(String no_telp) {
		this.no_telp = no_telp;
	}

	public Mahasiswa(String nim, String nama, String alamat, String email, String no_telp) {
		super();
		this.nim = nim;
		this.nama = nama;
		this.alamat = alamat;
		this.email = email;
		this.no_telp = no_telp;
	}
	
	public Mahasiswa() {
		
	}
	
}
