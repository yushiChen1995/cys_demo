package com.cys.service;

import org.apache.commons.lang.time.DateUtils;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.Date;

/**
 * @author cys
 * @date 2019/6/10
 */
public class Demo7 {
    public static void main(String[] args) {
        String format = String.format("%.3f", 1 * 0.01);
        System.out.println("divide = " + format);
    }
}
