package com.example.dynamicform.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by YINPAN on 2020/3/7
 */
@RestController
@RequestMapping(value = "/")
public class MvcController {

    @GetMapping(value = "/index")
    public ModelAndView login(ModelAndView mv) {
        mv.setViewName("index");
        return mv;
    }
    @GetMapping(value = "/home")
    public ModelAndView home(ModelAndView mv) {
        mv.setViewName("home");
        return mv;
    }

    @GetMapping(value = "/add")
    public ModelAndView fromadd(ModelAndView mv) {
        mv.setViewName("from_add");
        return mv;
    }
}
