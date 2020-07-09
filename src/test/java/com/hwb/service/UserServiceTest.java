package com.hwb.service;

import com.hwb.pojo.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


import java.util.List;



@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:applicationContext.xml"})
public class UserServiceTest {

    @Autowired
    UserService UserService;


    @Test
    public void getUser(){

        User user = UserService.getUser(2);
        System.out.println(user.toString());
    }

    @Test
    public void getAllUser(){

        List<User> userList = UserService.getAllUser();
        System.out.println(userList.toString());
    }
}
