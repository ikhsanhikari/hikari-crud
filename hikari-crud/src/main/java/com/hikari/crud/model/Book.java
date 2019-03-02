package com.hikari.crud.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.sql.Date;

/**
 * Created by hikari on 16/11/2018.
 */

@Entity
@Table(name = "book")
public class Book {
    @Id
    private String book_id;

    @Column
    private String book_name;

    @Column
    private String author;

    @Column
    private String category;

    public void setDate_release(Date date_release) {
        this.date_release = date_release;
    }

    public Date getDate_release() {
        return date_release;
    }

    @Column
    private Date date_release;

    public Book() {
    }

    public Book(String book_id, String book_name, String author, String category, Date date_release) {
        this.book_id = book_id;
        this.book_name = book_name;
        this.author = author;
        this.category = category;
        this.date_release = date_release;
    }

    public String getBook_id() {
        return book_id;
    }

    public void setBook_id(String book_id) {
        this.book_id = book_id;
    }

    public String getBook_name() {
        return book_name;
    }

    public void setBook_name(String book_name) {
        this.book_name = book_name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }


}
