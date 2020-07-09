package com.hwb.controller;


import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.hwb.pojo.User;
import com.hwb.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService UserService;

    @RequestMapping("/all")
    @ResponseBody
    public String list() throws JsonProcessingException {

        ObjectMapper objectMapper = new ObjectMapper();

        String str = objectMapper.writeValueAsString(UserService.getAllUser());
        return str;
    }


    @RequestMapping("/get")
    @ResponseBody
    public String get() throws JsonProcessingException {

        ObjectMapper objectMapper = new ObjectMapper();

        User user = UserService.getUser(2);


        String str = objectMapper.writeValueAsString(user);
        return UserService.getUser(2).toString();
    }

    @RequestMapping("/user")
    public String user(Model model) {

        User user = UserService.getUser(2);
        System.out.println(user.toString());
        model.addAttribute("res", user.toString());
        return "user";
    }

}
