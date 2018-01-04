package com.sx312.learn.service;

import com.sx312.learn.entity.User;

/**
 * created by  luwei
 * 2018-01-04 14:15.
 **/
public interface UserService {


    public User addUser(User user);

    public User findByUsername(String usernmae);
}
