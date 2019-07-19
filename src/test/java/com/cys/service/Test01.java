//package com.cys.service;
//
//import java.util.*;
//
///**
// * 按照斗地主的规则，完成洗牌发牌的动作。
// * <p>
// * 具体规则：
// * <p>
// * 使用54张牌打乱顺序,三个玩家参与游戏，三人交替摸牌，每人17张牌，最后三张留作底牌。
// * <p>
// * 斗地主案例分析：
// * 1.准备54张牌pokers
// * 2.洗牌
// * 3.创建4个集合，按顺序抓牌
// * 4.分别展示4个集合的牌即可
// */
//public class Test01 {
//    public static void main(String[] args) {
//        String[] colors = {"", "", "", ""};
//        String[] nums = {"3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A", "2"};
//
//        ArrayList<String> pokers = new ArrayList<>();
//        for (String color : colors) {
//            for (String num : nums) {
//                pokers.add(color + num);
//            }
//        }
//        pokers.add("大王");
//        pokers.add("小王");
//
//        System.out.println(pokers.size());
//        System.out.println(pokers);
//        //洗牌
//        Collections.shuffle(pokers);
//        System.out.println(pokers.size());
//        System.out.println(pokers);
//
//        //3.创建4个集合，按顺序抓牌
////        ArrayList<String> player = new ArrayList<>();
////        ArrayList<String> player1 = new ArrayList<>();
////        ArrayList<String> player2 = new ArrayList<>();
////        ArrayList<String> dipai = new ArrayList<>();
//
//        TreeSet<Integer> player = new TreeSet<Integer>();
//        TreeSet<Integer> player1 = new TreeSet<Integer>();
//        TreeSet<Integer> player2 = new TreeSet<Integer>();
//        TreeSet<Integer> dipai = new TreeSet<Integer>();
//
//        for (int i = 0; i < pokers.size(); i++) {
//            if (i >= pokers.size() - 3) {
//                dipai.add(pokers.get(i));
//
//            } else {
//                switch (i % 3) {
//                    case 0:
//                        player.add(pokers.get(i));
//                        break;
//                    case 1:
//                        player1.add(pokers.get(i));
//                        break;
//                    case 2:
//                        player2.add(pokers.get(i));
//                        break;
//                    default:
//                }
//
//            }
//        }
//        System.out.println("玩家一:"+player);
//        System.out.println("玩家二:"+player1);
//        System.out.println("玩家三:"+player2);
//        System.out.println("玩家斯:"+dipai);
//                //看牌
//         lookpoker("玩家1", player1, player);
//         lookpoker("玩家2", player2, poker);
//         lookpoker("玩家3", player3, poker);
//         lookpoker("底牌", dipai, poker);
//
//
//    }
//
//    //创建一个看牌的方法，a：返回类型：void
//    //b：参数列表：String name(玩家名字) ; TreeSet<Integer> i(牌的编号) ; HashMap<Integer,String> hm(牌)
//    public static void lookpoker(String name, TreeSet<Integer> i , HashMap<Integer,String> hm) {
//        //首先是名字
//        System.out.print(name+"的牌是：");
//        //其次是牌,遍历
//        for(Integer key : i){
//            //TreeSet的值就是HashMap的键,所以可以得到对应的值，也就是牌
//            String result = hm.get(key);
//            //输出看到的牌
//            System.out.print(result+"  ");
//        }
//        System.out.println(" ");
//
//    }
//
//}
