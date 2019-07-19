package com.cys.service;

import java.util.*;

/**
 * @author chenyushi
 * @date 2018/12/26
 */
public class Demo {
    public static void main(String[] args) {

        int[] arr = {1, 3, 4, 5, 0, 0, 6, 6, 0, 5, 4, 7, 6, 7, 0, 5};
        //定义一个方法   将数组中的0使用1-10之间的随机数替换掉,并统计替换了多少个
        //调用方法
        int[] replaceArr = replace(arr);
        //遍历数组
        System.out.print("替换后的arr: {");
        for (int i = 0; i < replaceArr.length; i++) {
            System.out.print(replaceArr[i]);
            if (i < replaceArr.length - 1) {
                System.out.print(", ");
            } else {
                System.out.println("}");
            }
        }

    }

    private static int[] replace(int[] arr) {
        //初始化替换个数
        int count = 0;
        //遍历数组
        for (int i = 0; i < arr.length; i++) {
            //如果有数组中有元素==0  将其替换成1-10之间的随机
            if (arr[i] == 0) {
                //获取1-10之间的随机数
                int randomNum = new Random().nextInt(10) + 1;
                //替换该元素
                arr[i] = randomNum;
                //并统计替换了多少个
                count++;
            }
        }
        System.out.println("共替换了" + count + "个");
        return arr;
    }


}
