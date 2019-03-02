package com.hikari.crud.model;

import javax.persistence.*;
import java.sql.Date;

/**
 * Created by hikari on 22/11/2018.
 */
@Entity
@Table(name = "author")
public class Author {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", updatable = false, nullable = false)
    private Long id;

	@Column
    private String name;

	@Column
    private String address;

	@Column
    private Date born_date;

    public Author() {
    }

    public Author(Long id, String name, String address, Date born_date) {

        this.id = id;
        this.name = name;
        this.address = address;
        this.born_date = born_date;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Date getBorn_date() {
        return born_date;
    }

    public void setBorn_date(Date born_date) {
        this.born_date = born_date;
    }
}
