package com.sx312.learn.repository;

import com.sx312.learn.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * created by  luwei
 * 2018-01-04 14:21.
 **/
public interface UserRepository extends JpaRepository<User, String>{

    public User findByUsername(String usernmae);
}
