package com.study.first.controller;


import com.study.first.dao.StudentDao;
import com.study.first.pojo.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
@RequestMapping("/test")
public class TestController {

    @Autowired
    private StudentDao studentDao;

    @GetMapping("/hello")
    public String test(){
        return "hello world!";
    }


    @GetMapping("getStudent")
    public Student get(){

        return studentDao.findById(1).get();

    }

    @GetMapping("f")
    public ModelAndView first(){

        return new ModelAndView("fist");

    }
}
