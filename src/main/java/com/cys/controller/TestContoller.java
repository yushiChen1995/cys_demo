package com.cys.controller;

import com.cys.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;


@RestController
@RequestMapping(value = "/test")
@EnableAsync
public class TestContoller {
 
    @Autowired
    private TestService testService;
 
    @GetMapping(value = "/testAsync")
    public void print() throws ExecutionException, InterruptedException {
        String s = "a";
        String s1 = "b";
        System.out.println("ThreadName:" + Thread.currentThread().getName());
        System.out.println("当前线程开始执行测试函数......");
        Future<String> test = testService.test(s);
        for (int i = 1; i <= 100; i++) {
            System.out.print(i + " ");
            if (i % 10 == 0) {
                System.out.println();
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
        System.out.println("当前线程测试函数执行完毕......");
        System.out.println("test" + test.get());
    }
}