package com.hany.graduationpro.basketballhome.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController()
@RequestMapping("/basketball")
public class basketballhome {

    Logger logger = LoggerFactory.getLogger(this.getClass());
    @RequestMapping("/index")
    public String index(){

        System.out.println("================test Access================");
        return "hello world";
    }
}
