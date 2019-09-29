package com.zxl.spring_boot_06_thymeleaf.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.*;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

/**
 * @author zxl16
 * @Date 2019/9/26.
 */
@Configuration
@EnableWebMvc
@ComponentScan("com.zxl.spring_boot_06_thymeleaf")
public class ThymeleafConfig{
    /**
     * 视图解析
     * @return
     */
    @Bean
    public InternalResourceViewResolver viewResolver(){
        InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
        viewResolver.setPrefix("WEB-INF/classes/views/");
        viewResolver.setSuffix(".html");
        viewResolver.setViewClass(JstlView.class);
        return  viewResolver;
    }
}
