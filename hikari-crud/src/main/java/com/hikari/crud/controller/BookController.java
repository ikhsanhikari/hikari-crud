package com.hikari.crud.controller;

import com.hikari.crud.core.JspBaseController;
import com.hikari.crud.model.Book;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by hikari on 16/11/2018.
 */

@Controller
@RequestMapping("/book")
public class BookController extends JspBaseController<Book,String> {

}
