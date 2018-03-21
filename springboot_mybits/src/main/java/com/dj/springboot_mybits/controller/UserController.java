package com.dj.springboot_mybits.controller;

import com.dj.springboot_mybits.pojo.User;
import com.dj.springboot_mybits.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class UserController {


    @Autowired
    private UserService userService;


    @RequestMapping("userList")
    public String userList(Model model){
        List<User> users = userService.userList();
        model.addAttribute("userList",userService.userList());
        return "userList";
    }

    @RequestMapping("bug")
    public String bug(){
        return "bug";
    }

    @RequestMapping("success")
    public String success(){
        return "success";
    }

    @RequestMapping("index")
    public String index(){
        return "index";
    }
}
