package com.hikari.crud.model;

import javax.persistence.*;

/**
 * Created by hikari on 18/11/2018.
 */
@Entity
@Table(name = "menu")
public class Menu {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column
    private String menu_name;


    @Column
    private String menu_url;

    @Column
    private Integer is_display;

    @Column
    private String icon;

    public Menu() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMenu_name() {
        return menu_name;
    }

    public void setMenu_name(String menu_name) {
        this.menu_name = menu_name;
    }

    public String getMenu_url() {
        return menu_url;
    }

    public void setMenu_url(String menu_url) {
        this.menu_url = menu_url;
    }

    public Integer getIs_display() {
        return is_display;
    }

    public void setIs_display(Integer is_display) {
        this.is_display = is_display;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public Menu(Integer id, String menu_name, String menu_url, Integer is_display, String icon) {

        this.id = id;
        this.menu_name = menu_name;
        this.menu_url = menu_url;
        this.is_display = is_display;
        this.icon = icon;
    }
}
