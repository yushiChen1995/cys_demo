package com.cys.controller;

import com.cys.annotation.RequireLogin;
import com.cys.pojo.User;
import com.cys.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author chenyushi
 * @date 2018/11/15
 */
@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("queryUser")
    public ResponseEntity<List<User>> queryUser(){
        List<User> users = userService.queryUser();
        return ResponseEntity.ok(users);
    }

    @PostMapping("insertUser")
    public ResponseEntity<Boolean> insertUser(@RequestBody User user){
        userService.insertUser(user);
        return ResponseEntity.ok(true);
    }

    @PostMapping("test1")
    public ResponseEntity<String> test1(User user){
        String userName = user.getUserName();
        return ResponseEntity.ok(userName);
    }
}
