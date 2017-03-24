package com.wang.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by hppc on 2017/3/23.
 */
@RestController
@RequestMapping("/controller01")
public class Controller01 {
    @RequestMapping("/demo01")
    @ResponseBody
    public String demo01(){
        return "hello world";
    }
    @RequestMapping("/demo02/{username1}")
    @ResponseBody
    public String demo02(@PathVariable("username1") String username){
        return username;
    }
}
