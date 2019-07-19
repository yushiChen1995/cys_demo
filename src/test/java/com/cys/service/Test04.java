package com.cys.service;

import java.util.Scanner;

//        if输入星期数，显示今天的减肥活动
//        周一：跑步
//        周二：游泳
//        周三：慢走
//        周四：动感单车
//        周五：拳击
//        周六：爬山
//        周日：好好吃一顿
//        步骤：
//        1.键盘录入 导包 创建对象 获取录入的数据 Scanner
//        2.根据录入的数据使用if-else-if进行判断并输出
//        补充：
//        1）生成返回类型和变量名：new Scanner(System.in) 按万能键或者.var
//        2）将部分代码抽取到自定义方法中快捷键是：ctrl+alt+M
public class Test04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入今天的星期");
        int week = sc.nextInt();
        switchWeek(week);
    }

    private static void switchWeek(int week) {
        switch (week) {
            case 1:
                System.out.println("跑步");
                break;
            case 2:
                System.out.println("游泳");
                break;
            case 3:
                System.out.println("慢走");
                break;
            case 4:
                System.out.println("动感单车");
                break;
            case 5:
                System.out.println("拳击");
                break;
            case 6:
                System.out.println("爬山");
                break;
            case 7:
                System.out.println("好好吃一顿");
                break;
            default:
                System.out.println("输入的数字有误");
                break;
        }
    }

}


