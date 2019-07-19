package com.cys.service.cys;


import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.TreeSet;

public class PokerDemo {
    public static void main(String[] args) {

        //创建一个HashMap集合
        HashMap<Integer, String> poker = new HashMap<Integer, String>();

        //创建一个ArrayList集合
        ArrayList<Integer> index = new ArrayList<Integer>();
        int i = 0;
        System.out.println(10/i);

        //创建两个字符串，一个是花色，一个是牌的数字      （发牌得有一盒牌）
        String[] colors = {"♦", "♣", "♥", "♠"};

        String[] numbers = {"3", "4", "5", "6", "7", "8", "9", "10", "J", "Q",
                "K", "A", "2",};
        //把这两个字符串放进HashMap集合中（拼接一起 花色+牌号）同时给每个放进去牌进行编码0--52并存储
        int count = 0;
        for (String number : numbers) {
            for (String color : colors) {
                //拼接
                String pk = color.concat(number);
                //把编码和牌存储到HashMap中,key是编码,value是拼接后的牌 例:<0,♦3>
                poker.put(count, pk);

                //把编码存到ArrayList中
                index.add(count);

                count++;
            }
        }
        //给大小王编码并存储
        poker.put(count, "小王");
        index.add(count);
        //53是小王
        count++;
        //54是大王
        poker.put(count, "大王");
        index.add(count);

        //洗牌
        Collections.shuffle(index);

        //发牌，由于要排序，所以创建TreeSet集合，斗地主是3人和底牌3张，对应4个集合,
        TreeSet<Integer> player1 = new TreeSet<>();
        TreeSet<Integer> player2 = new TreeSet<>();
        TreeSet<Integer> player3 = new TreeSet<>();
        TreeSet<Integer> diPai = new TreeSet<>();

        //a：利用取模的方法给3个人发牌，x%3=0；x%3=1；x%3=2    b：底牌剩下的3张
        //此时ArrayList中已经存储了0-54的编码
        for (int x = 0; x < index.size(); x++) {
            if (x >= index.size() - 3) {
                //底牌
                diPai.add(index.get(x));
            } else if (x % 3 == 0) {
                //玩家1
                player1.add(index.get(x));
            } else if (x % 3 == 1) {
                //玩家2
                player2.add(index.get(x));
            } else {
                //玩家3
                player3.add(index.get(x));
            }
        }

        //看牌
        lookPoker("玩家1", player1, poker);
        lookPoker("玩家2", player2, poker);
        lookPoker("玩家3", player3, poker);
        lookPoker("底牌", diPai, poker);
    }

    //创建一个看牌的方法，a：返回类型：void
    //b：参数列表：String name(玩家名字) ; TreeSet<Integer> i(牌的编号) ; HashMap<Integer,String> hm(牌)
    private static void lookPoker(String name, TreeSet<Integer> i, HashMap<Integer, String> hm) {
        //首先是名字
        System.out.print(name + "的牌是：");
        //其次是牌,遍历
        for (Integer key : i) {
            //TreeSet的值就是HashMap的键,所以可以得到对应的值，也就是牌
            String result = hm.get(key);
            //输出看到的牌
            System.out.print(result + "   ");
        }
        System.out.println(" ");

    }

}