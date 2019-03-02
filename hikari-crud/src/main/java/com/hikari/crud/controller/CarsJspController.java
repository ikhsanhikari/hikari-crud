package com.hikari.crud.controller;

import com.hikari.crud.core.JspBaseController;
import com.hikari.crud.model.Cars;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by hikari on 16/11/2018.
 */

@Controller
@RequestMapping("/cars")
public class CarsJspController extends JspBaseController<Cars,String> {
}
