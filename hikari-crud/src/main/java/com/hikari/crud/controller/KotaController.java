package com.hikari.crud.controller;

import com.hikari.crud.core.JspBaseController;
import com.hikari.crud.model.Kota;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by hikari on 23/11/2018.
 */
@Controller
@RequestMapping("/kota")
public class KotaController extends JspBaseController<Kota,Integer>{
}
