package com.wang.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by hppc on 2017/3/26.
 */
@RestController
//@RequestMapping(value = "/serviceregister") //中文乱码问题还没有解决
public class controller01 {
    @Value("${words}") String words;
    @RequestMapping("/")
    public String getWord(){
        String[] wordArray = words.split(",");
        int i = (int)Math.round(Math.random()*(wordArray.length-1));
        return wordArray[i];
    }
}
