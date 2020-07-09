package com.hwb.dao;

import com.hwb.pojo.User;

import java.util.List;

public interface UserMapper {

    public int addUser(User user);

    public int deleteUser(int id);

    public int updateUser(User user);

    public User getUser(int id);

    public List<User> getAllUser();

}
