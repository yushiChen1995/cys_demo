package com.cys.cys;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Test02 {
    private static volatile int count = 0;

    public static void main(String[] args) throws InterruptedException {
//        for (int i = 0;i<5; i++){
//            Thread a = new Thread(() -> {
//                for (int i1 = 0; i1 <2; i1++){
//                    try {
//                        TimeUnit.MILLISECONDS.sleep(50l);
//                        Lock lock = new ReentrantLock();
//                        count++;
//                        lock.lock();
//                    }catch (Exception e){
//                        e.printStackTrace();
//                    }
//                    System.out.println(count+(count!=10?",":""));
//                }
//            });
//            a.start();
//        }
    }
}