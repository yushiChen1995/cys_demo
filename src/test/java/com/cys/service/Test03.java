package daytest02;

import java.util.Scanner;

/*if输入星期数，显示今天的减肥活动
         周一：跑步
         周二：游泳
         周三：慢走
         周四：动感单车
         周五：拳击
         周六：爬山
         周日：好好吃一顿
         步骤：
         1.键盘录入 导包 创建对象 获取录入的数据 Scanner
         2.根据录入的数据使用if-else-if进行判断并输出
         补充：
         1）生成返回类型和变量名：new Scanner(System.in) 按万能键或者.var
         2）将部分代码抽取到自定义方法中快捷键是：ctrl+alt+M
         */
public class Test03 {
    //1 , main方法入栈
    public static void main(String[] args) {
        //2, 调用pian()方法,此时会找main方法里面有week这个变量吗,请问main方法里面有week这个变量吗?
        pian();

    }
    //3,pian入栈,  执行完毕
    public static void pian() {


        Scanner sc = new Scanner(System.in);
        System.out.println("请输入今天星期几");
        int week= sc.nextInt();
        //比如 如果用户在控制台输入一个8, 我就不想再让他往下走了
        if (week == 8) {
            return;
        }



        if(week == 1 ){
            System.out.println("跑步");
        }else if(week==2){
            System.out.println("游泳");
        }else if(week==3){
            System.out.println("慢走");
        }else if(week== 4){
            System.out.println("动感单车");
        }else if(week== 5){
            System.out.println("拳击");
        }else if(week==6){
            System.out.println("爬山");
        }else if(week== 7){
            System.out.println("好好吃一顿");
        }else{
            System.out.println("你输入的数字有误");
            return ;
        }

    }
}