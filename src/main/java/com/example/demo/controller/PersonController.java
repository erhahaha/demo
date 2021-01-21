package com.example.demo.controller;

import com.example.demo.model.Person;
import com.example.demo.service.impl.PersonServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/person")
public class PersonController {

    @Autowired
    PersonServiceImpl personServiceImpl;

    // 设置访问路由值为路径
    @RequestMapping("/personList")
    public List<Person> personList(){
        // 顾名思义 实体和数据 同时返回页面模板和数据
        //ModelAndView mav = new ModelAndView("index");
        List<Person> list = personServiceImpl.getAll();
        //mav.addObject("list",list);
        return list;
    }
}