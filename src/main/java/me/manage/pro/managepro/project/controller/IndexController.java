package me.manage.pro.managepro.project.controller;

import me.manage.pro.managepro.project.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class IndexController {

    @RequestMapping("/index")
    @ResponseBody
    public User index() {
        User user = new User();
        return user;
    }
}
