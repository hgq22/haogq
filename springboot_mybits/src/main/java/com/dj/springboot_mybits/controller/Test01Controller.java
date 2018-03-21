package com.dj.springboot_mybits.controller;

import com.dj.springboot_mybits.pojo.Test01;
import com.dj.springboot_mybits.pojo.Test02;
import com.dj.springboot_mybits.service.Test01Service;
import com.dj.springboot_mybits.service.Test02Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class Test01Controller {

    @Autowired
    private Test01Service test01Service;

    @Autowired
    private Test02Service test02Service;

    @RequestMapping("test01List")
    @ResponseBody
    public List<Test01> test01List(){
        return test01Service.testList();
    }

    @RequestMapping("test01")
    @ResponseBody
    public String test01(Integer id){
        test01Service.test01(id);
        return "success";
    }

    @RequestMapping("addTest02")
    @ResponseBody
    public String addTest02(@RequestBody Test02 test02){
        Integer id = test02Service.addTest(test02);
        if(id != null){
            return "success";
        }
        return "bug";
    }

    @RequestMapping("addTest01")
    @ResponseBody
    public Integer addTest01(Test01 test01){
        test01Service.addTest(test01);
        Integer id = test01.getId();
        return id;
    }

    @RequestMapping("updateTest01")
    @ResponseBody
    public String updateTest01(Test01 test01){
        test01Service.updateTest(test01);
        return "success";
    }

    @RequestMapping("deleteTest01")
    @ResponseBody
    public String deleteTest01(Integer id){
        test01Service.deleteTest(id);
        return "success";
    }
}
