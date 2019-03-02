package com.hikari.crud.controller;

import com.hikari.crud.core.JspBaseController;
import com.hikari.crud.model.Author;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by hikari on 22/11/2018.
 */

@Controller
@RequestMapping("/author")
public class AuthorController extends JspBaseController<Author,Long>{
}
