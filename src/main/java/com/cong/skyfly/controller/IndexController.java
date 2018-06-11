package com.cong.skyfly.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by liujiancong on 2018/6/11.
 */
@RestController
public class IndexController {

    @RequestMapping("/index")
    public String index(){

        return "index";
    }

    @RequestMapping("/test")
    public String test(){
        return "test";
    }
}
