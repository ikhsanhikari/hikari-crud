package com.hikari.crud.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by hikari on 22/11/2018.
 */
@Controller
public class MerutiController {
    @GetMapping("/meruti")
    public String get(){
        return "test";
    }
}
