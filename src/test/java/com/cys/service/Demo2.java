package com.cys.service;

/**
 * @author chenyushi
 * @date 2018/12/26
 */
public class Demo2 {
    public static void main(String[] args) {
        //定义int 数组
        int[] arr = {1, 3, 4, 5, 0, 0, 6, 6, 0, 5, 4, 7, 6, 7, 0, 5};
        queryCount(arr);
    }

    /**
     * 定义第一个方法
     * 求出指定元素在数组中出现的次数
     *
     * @param number 指定的元素
     * @param arr    指定的数组
     */
    private static int getCount(int number, int[] arr) {
        //初始化次数
        int count = 0;
        //遍历数组
        for (int i = 0; i < arr.length; i++) {
            if (number == arr[i]) {
                //如果指定元素在该数组中存在就统计次数
                count++;
            }

        }
        System.out.println("元素 " + number + " 在arr数组中出现了 " + count + " 次数");
        //返回统计次数
        return count;
    }

    /**
     * 定义第二个方法
     * 统计数组中出现次数为1次的元素一共有多少个,
     *
     * @param arr 指定的数组
     */
    private static void queryCount(int[] arr) {
        //初始化出现次数为一次的元素的值
        int num = 0;
        //如果只出现一次就统计
        for (int i = 0; i < arr.length; i++) {
            //遍历数组, 然后调第一个方法,返回数组中所有的元素出现的额次数
            int count = getCount(arr[i], arr);
            //如果只出现一次就统计
            if (count == 1) {
                System.out.println(arr[i] + "在数组中只出现了1次");
                //出现次数为一次 +1
                num++;
            }
        }
        System.out.println("数组中出现一次的元素有" + num + "个");
    }
}