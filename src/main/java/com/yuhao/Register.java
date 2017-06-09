package com.yuhao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Register {

    @Autowired
    private ThreadService threadService;

    @RequestMapping("/sendemail")
    public String home() throws InterruptedException {
        threadService.sendEmail("zhangyuhaoxy@gmail.com");
        System.out.println("next");
        System.out.println("next");
        System.out.println("next");
        System.out.println("next");
        System.out.println("next");
        System.out.println("next");
        System.out.println("next");
        System.out.println("next");
        System.out.println("next");
        System.out.println("next");
        System.out.println("next");
        System.out.println("next");
        System.out.println("next");
        System.out.println("next");
        System.out.println("next");
        Thread.sleep(10);
        System.out.println("next");
        System.out.println("next");
        System.out.println("next");
        System.out.println("next");
        System.out.println("next");
        return "home";
    }
}
