package com.hwb.service;

import com.hwb.dao.UserMapper;
import com.hwb.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class UserServiceImp implements UserService {
    @Autowired
    private UserMapper userMapper;

    public int addUser(User user) {
        return userMapper.addUser(user);
    }

    public int deleteUser(int id) {
        return userMapper.deleteUser(id);
    }

    public int updateUser(User user) {
        return userMapper.updateUser(user);
    }

    public User getUser(int id) {
        return userMapper.getUser(id);
    }

    public List<User> getAllUser() {
        return userMapper.getAllUser();
    }
}
