package com.hikari.crud.controller;

import com.google.common.collect.Lists;
import com.hikari.crud.core.JspBaseController;
import com.hikari.crud.core.JspRepository;
import com.hikari.crud.dto.ColumnDto;
import com.hikari.crud.model.Cars;
import com.hikari.crud.model.Mahasiswa;
import com.hikari.crud.repository.CarsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Created by hikari on 16/11/2018.
 */

@Controller
@RequestMapping("mahasiswa")
public class JspController extends  JspBaseController<Mahasiswa,String>{



}
