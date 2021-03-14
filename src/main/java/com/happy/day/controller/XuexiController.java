package com.happy.day.controller;


import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author yangming
 * @since 2021-03-14
 */
@Controller
@RequestMapping("/xuexi")
public class XuexiController {

    @RequestMapping("/list")
    public String sadf(){
        System.out.println("================");
        return  "xx";
    }
}

