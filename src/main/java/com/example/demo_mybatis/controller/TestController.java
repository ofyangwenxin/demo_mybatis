package com.example.demo_mybatis.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import test.model.MngSysLog;

@RestController
public class TestController {

    @RequestMapping("/hi")
    public MngSysLog hi(MngSysLog mngSysLog) {
        System.out.println(mngSysLog.getCreateDate());
        return mngSysLog;
    }

}
