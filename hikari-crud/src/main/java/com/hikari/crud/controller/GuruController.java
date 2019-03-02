package com.hikari.crud.controller;

import com.hikari.crud.core.JspBaseController;
import com.hikari.crud.model.Guru;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by hikari on 18/11/2018.
 */

@Controller
@RequestMapping("/guru")
public class GuruController extends JspBaseController<Guru,String>{
}
