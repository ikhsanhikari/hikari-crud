package com.hikari.crud.controller;

import com.hikari.crud.core.BaseController;
import com.hikari.crud.model.Cars;
import com.hikari.crud.model.Guru;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by hikari on 14/11/2018.
 */
//@EnableJpaRepositories("com.hikari.crud.repository")
//@EntityScan("com.hikari.crud.model")


@RestController
@RequestMapping("/guru")
public class TestController extends BaseController<Guru,String>{

}
