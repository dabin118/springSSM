package com.hwb.controller;


import com.hwb.pojo.User;
import com.hwb.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/restfulapi")
public class UserRestController {

    @Autowired
    private UserService userService;

    @RequestMapping("/user")
    public User list() {

        return userService.getUser(2);
    }
}
