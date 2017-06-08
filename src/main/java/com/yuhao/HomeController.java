package com.yuhao;

import java.util.List;

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
            User saveUser = userRepository.save(new User("zhangyuhaoxy4@hotmail.com", "yuhao"));
            System.out.println(saveUser.getId());
            List<User> oUser = userRepository.findByEmailLike("zhafng%");
            for (User user : oUser) {
                System.out.println("yes");
                System.out.println(user.getEmail());
            }
        } catch (DataIntegrityViolationException e) {
            // TODO: handle exception
            System.out.println("error email");
        }

        return "home";
    }
}
