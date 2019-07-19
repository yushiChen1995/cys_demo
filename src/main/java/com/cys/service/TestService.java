package com.cys.service;
 
import org.springframework.scheduling.annotation.Async;

import java.util.concurrent.Future;


public interface TestService {

    Future<String> test(String s) throws InterruptedException;
}