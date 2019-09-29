package com.zxl.ctroller;

import com.zxl.admin.SinglePerson;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author zxl16
 * @Date 2019/9/26.
 */
@Controller
public class ThymeleafController {
    @RequestMapping("/index")
    public String index(ModelAndView modelAndView){
        SinglePerson singlePerson = new SinglePerson();
        singlePerson.setName("李思雨");
        modelAndView.addObject("singlePerson",singlePerson);
        return "index";
    }
}
