package com.cys.service;

/*
    案例需求:定义一个方法，用于比较两int个数组的内容是否相同
 */
public class Test05 {
    public static void main(String[] args) {
        //定义两个int类型的数组
        int[] arr1 = {11, 22, 33, 44, 55};
        int[] arr2 = {11, 22, 33, 44, 15};
        //调用自定义方法，将上述两个数组作为方法参数传递
        boolean boo = compare(arr1, arr2);
        System.out.println("boo = " + boo);
    }

    //自定义方法比较两个数组是否相同
    public static boolean compare(int[] arr1, int[] arr2) {
        //先比较数组长度，如果长度不相等，说明两个数组肯定不一样
        if (arr1.length != arr2.length) {
            //说明长度不等，返回给调用者false
            return false;
        }
        //如果jvm能够执行到这里，说明数组长度肯定相等，判断数组内容
        //遍历
        /*
            index表示两个数组索引
            index < arr1.length 这里可以使用arr1.length也可以使用arr2.length
            因为执行到这里说明数组长度一致
         */
        for (int index = 0; index < arr1.length; index++) {
            //比较两个数组内容
            if (arr1[index] != arr2[index]) {
                //说明数组内容不一样
                return false;
            }

        }
        return true;
    }
}