package com.cys.service;

import com.cys.mapper.UserMapper;
import com.cys.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author chenyushi
 * @date 2018/11/15
 */
@Service
public class UserService {
    @Autowired
    private UserMapper mapper;

    public List<User> queryUser(){
        return mapper.selectAll();
    }

    @Async
    public void insertUser(User user) {
        mapper.insertSelective(user);
    }
}
