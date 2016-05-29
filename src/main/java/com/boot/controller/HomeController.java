package com.boot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Andrew on 10/05/2016.
 */
@RestController
public class HomeController {

    @RequestMapping("/")
    public String home() {
        return "Das Boot, reporting for duty!!!";
    }
}
