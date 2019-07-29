package com.cys.controller;

import com.cys.pojo.User;
import com.cys.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

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

    @GetMapping("test1")
    public ResponseEntity<String> test1(){
        return ResponseEntity.ok("hello,jenkins---jenkins实现自动化部署---");
    }

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        List<String> list1 = new ArrayList<>();
        list.add("1");
        list.add("2");
        for (String s : list) {
            List<String> list3 = new ArrayList<>();
            if (s.equals("1")) {
                list3.add("3");
            }
            if (s.equals("2")) {
                list3.add("4");
            }
            list1.addAll(list3);
        }
        System.out.println("list1 = " + list1);
    }
}
