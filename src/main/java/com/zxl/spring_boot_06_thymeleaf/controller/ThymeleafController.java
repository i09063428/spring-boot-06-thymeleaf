package com.zxl.spring_boot_06_thymeleaf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author zxl16
 * @Date 2019/9/26.
 */
@Controller
public class ThymeleafController {
    @RequestMapping("/index")
    public String index(){
        return "index";
    }
}
