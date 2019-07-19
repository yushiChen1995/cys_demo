package com.cys.cys;

import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * @author chenyushi
 * @date 2018/11/15
 */

@Component("taskJob")
@EnableScheduling
public class Test2 {
//    @Scheduled(cron = "0/10000 * * * * ?")
//    public void showTime(){
//        Date date = new Date();
//        System.out.println("吃饭吃饭" + date);
//    }
}
