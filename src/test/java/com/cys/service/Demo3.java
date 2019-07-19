package com.cys.service;

import java.util.ArrayList;
import java.util.List;

/**
 * @author cys
 * @date 2019/6/5
 */
public class Demo3 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        for (Integer integer : list) {
            System.out.println(integer);
        }
    }
}
