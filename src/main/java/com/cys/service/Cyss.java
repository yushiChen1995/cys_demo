package com.cys.service;

import com.alibaba.fastjson.JSONObject;
import com.cys.pojo.User;
import org.apache.commons.lang3.StringUtils;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.TemporalAdjusters;
import java.util.*;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author chenyushi
 * @date 2019/2/12
 */
public class Cyss {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        c.add(Calendar.MONTH, 0);
        c.set(Calendar.DAY_OF_MONTH, 1);//设置为1号,当前日期既为本月第一天
        //将小时至0
        c.set(Calendar.HOUR_OF_DAY, 0);
        //将分钟至0
        c.set(Calendar.MINUTE, 0);
        //将秒至0
        c.set(Calendar.SECOND,0);
        //将毫秒至0
        c.set(Calendar.MILLISECOND, 0);
        // 获取本月第一天的时间戳
        System.out.println(c.getTimeInMillis());

        //获取当前月最后一天
        Calendar ca = Calendar.getInstance();
        ca.set(Calendar.DAY_OF_MONTH, ca.getActualMaximum(Calendar.DAY_OF_MONTH));
        //将小时至0
        ca.set(Calendar.HOUR_OF_DAY, 23);
        //将分钟至0
        ca.set(Calendar.MINUTE, 59);
        //将秒至0
        ca.set(Calendar.SECOND,59);
        //将毫秒至0
        ca.set(Calendar.MILLISECOND, 59);
        // 获取本月最后一天的时间戳
        System.out.println(ca.getTimeInMillis());
// 获取当月第一天和最后一天
//        Calendar cale = null;
//        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
//        String firstday, lastday;
//        // 获取前月的第一天
//        cale = Calendar.getInstance();
//        cale.add(Calendar.MONTH, 0);
//        cale.set(Calendar.DAY_OF_MONTH, 1);
//        Date start = cale.getTime();
//        System.out.println("start = " + start.getTime());
//        firstday = format.format(start);
//        // 获取前月的最后一天
//        cale = Calendar.getInstance();
//        cale.add(Calendar.MONTH, 1);
//        cale.set(Calendar.DAY_OF_MONTH, 0);
//        Date time = cale.getTime();
//        long end = time.getTime();
//        System.out.println("end = " + end);
//        lastday = format.format(time);
//        System.out.println("本月第一天和最后一天分别是 ： " + firstday + " and " + lastday);
    }

}