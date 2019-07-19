package com.cys.service;

import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.AsyncResult;
import org.springframework.stereotype.Service;

import java.util.concurrent.Future;

@Service
public class TestServiceImpl implements TestService {
    @Async
    @Override
    public Future<String> test(String s) throws InterruptedException {
        System.out.println("ThreadName:" + Thread.currentThread().getName());
        int i = 2;
        Thread.sleep(1000 * 2);
        System.out.println("测试Spring 异步调用！");
        return new AsyncResult<>(s);
    }
}