package com.ethan.devtool;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: ethan.liu
 * @Date: 2019/11/27 15:04
 */
@RestController
@RequestMapping("devtool")
public class TestController {
    @RequestMapping("test111111")
    public Object test(){
        System.out.println("--------111111    ");

        return "123";
    }
}
