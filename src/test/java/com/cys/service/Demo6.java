package com.cys.service;

import com.cys.pojo.User;
import org.apache.commons.lang.StringUtils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Calendar;
import java.util.List;

/**
 * @author cys
 * @date 2019/5/31
 */
public class Demo6 {
    public static final String FORMAT_DATE = "yyyy-MM-dd";
    public static void main(String[] args) throws ParseException {
        Calendar c = Calendar.getInstance();
        c.setTime(new SimpleDateFormat(FORMAT_DATE).parse("2019-05-31"));
        long timeInMillis = c.getTimeInMillis();
        System.out.println("timeInMillis = " + timeInMillis);
    }
}
