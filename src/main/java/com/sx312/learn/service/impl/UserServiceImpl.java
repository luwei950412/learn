package com.sx312.learn.service.impl;

import com.sx312.learn.entity.User;
import com.sx312.learn.repository.UserRepository;
import com.sx312.learn.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * created by  luwei
 * 2018-01-04 14:17.
 **/
@Service
public class UserServiceImpl implements UserService{

    @Autowired
    public UserRepository userRepository;

    public User addUser(User user){
        return userRepository.save(user);
    }

    public User findByUsername(String username){

        return userRepository.findByUsername(username);
    }
}
