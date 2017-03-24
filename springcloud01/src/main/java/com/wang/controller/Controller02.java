package com.wang.controller;

import com.wang.model.User;
import com.wang.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by hppc on 2017/3/23.
 */
@Controller
@RequestMapping("/controller02")
public class Controller02 {
    @Autowired
    private AdminService adminService; //自动找实现类!
    @RequestMapping("/try01/{id}")
    public String try01(@PathVariable("id") String userid, Model model){
        User user = adminService.getuser(userid);
        model.addAttribute("id",user);
        return "hello";
    }
}
