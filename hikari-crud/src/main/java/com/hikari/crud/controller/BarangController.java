package com.hikari.crud.controller;

import com.hikari.crud.core.JspBaseController;
import com.hikari.crud.model.Barang;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by hikari on 21/11/2018.
 */

@Controller
@RequestMapping("/barang")
public class BarangController extends JspBaseController<Barang,String>{
}
