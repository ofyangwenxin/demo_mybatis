package com.example.demo_mybatis.controller;

import org.springframework.core.convert.support.GenericConversionService;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;

//@ControllerAdvice
public class WebConfigBean2 {

    @InitBinder
    public void initBinder(WebDataBinder binder) {
        GenericConversionService genericConversionService = (GenericConversionService) binder.getConversionService();
        if (genericConversionService != null) {
            genericConversionService.addConverter(new DateConverter());
        }
    }
}
