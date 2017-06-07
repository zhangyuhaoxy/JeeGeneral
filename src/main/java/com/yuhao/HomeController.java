package com.yuhao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
    @Autowired
    private UserRepository userRepository;

    @RequestMapping("/")
    public String home() {
        return "home";
    }

    @RequestMapping("/create")
    public String createUser() {
        try {
            userRepository.save(new User("zhangyuhaoxy@gmail.com", "yuhao"));
        } catch (DataIntegrityViolationException e) {
            // TODO: handle exception
            System.out.println("error email");
        }

        return "home";
    }
}
