package com.hikari.crud.controller;

import com.hikari.crud.core.LOVController;
import com.hikari.crud.model.Lov;
import com.hikari.crud.model.Negara;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by hikari on 16/11/2018.
 */
@RestController
@RequestMapping("/test")
public class TestLovController extends LOVController<Lov>{
}
