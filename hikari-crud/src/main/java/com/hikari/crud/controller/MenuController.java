package com.hikari.crud.controller;

import com.google.common.collect.Lists;
import com.hikari.crud.core.JspBaseController;
import com.hikari.crud.model.Menu;
import com.hikari.crud.repository.MenuRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * Created by hikari on 17/11/2018.
 */

@Controller
@RequestMapping("/menu")
public class MenuController extends JspBaseController<Menu,Integer>{
    @Autowired
    MenuRepository menuRepository;

    @GetMapping("/home")
    public String home(ModelMap map){
        List<Menu> listMenu = Lists.newArrayList(menuRepository.findAll());
        map.addAttribute("menu",listMenu);
        return "index";
    }
}
