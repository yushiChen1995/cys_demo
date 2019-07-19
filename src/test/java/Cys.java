
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.cys.pojo.A;
import com.cys.pojo.B;
import com.cys.pojo.User;
import org.apache.commons.lang.StringUtils;

import java.awt.*;
import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author chenyushi
 * @date 2018/11/15
 */
public class Cys {
    public static void main(String[] args) throws ParseException {

        Date date = new Date();
        System.out.println("date = " + date);

//        Wed Nov 21 11:07:49 CST 2018
//        Wed Nov 21 11:05:49 CST 2018
//        Wed Nov 21 10:05:49 CST 2018
//        Wed Nov 21 09:35:49 CST 2018
//        Wed Nov 21 13:07:49 CST 2018

//        Calendar c = Calendar.getInstance();
//        c.setTime(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse("Wed Nov 21 11:07:49 CST 2018"));
//        return c.getTimeInMillis();

//        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//        List<Object> objects = new ArrayList<>();
////        String s  = "Wed Nov 21 11:07:49 CST 2018";
////        Date parse = sdf.parse(s);
////        Date date = new Date("Wed Nov 21 11:07:49 CST 2018");
////        long time = date.getTime();
////        System.out.println("time = " + time);
//        Date date1 = new Date(1527258407328L);
//        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//        String format = sdf.format(date1);
//        System.out.println("date1 = " + format);
////        long l = System.currentTimeMillis();
//        List
//        System.out.println("l = " + l);
//        list.add("hello");
//        list.add("world");
//        list.clear();
//
//        List<String> list = new ArrayList<>();
//        list.add("hello");
       // String s = "liangjiangtao-20181127-LCB-14863.sql";
//        String s = "http://jira.lcbint.cn/browse/LCB-14863";
//        String md5 = Md5Util.getMd5(s);
//        System.out.println("md5 = " + md5);
//        List<String> list = new ArrayList<>();
//        list.add("a");
//        list.add("b");
//        list.add("c");
//
//        List<String> list2 = new ArrayList<>();
//        list2.add("f");
//
//     对接
//      对接方订单id
//        System.out.println(CollectionUtils.containsAny(list2,list));
//        Long l = 1544668807377L/1000;
//        System.out.println("l = " + l);
//        long l = System.currentTimeMillis();
//        System.out.println("l = " + l);
//        System.out.println("l / 1000 = " + l / 1000);
//
//        List<User> list = new ArrayList<>();
//        User user = new User();
//        user.setId(1L);
//        user.setAge(1);
//        user.setPassword("123");
//        user.setUserName("sss");
//        User user1 = new User();
//        user1.setAge(1);
//        user1.setPassword("123");
//        user1.setUserName("sss1");
//        user1.setId(2L);
//        list.add(user1);
//        list.add(user);
//        Map<Long, String> collect = list.stream().collect(Collectors.toMap(User::getId, User::getUserName));
//        System.out.println("collect = " + collect);
//        List<User> collect = list.stream().filter(a -> "sss".equals(a.getUserName())).collect(Collectors.toSet());
//        User user3 = collect.get(0);
//        System.out.println("user3 = " + user3);
//        if (first.isPresent()) {
//            User user2 = first.get();
//            System.out.println("first = " + user2);
//        }
//        Integer mul = mul("1345", "0.666");
//        System.out.println("mul = " + mul);
//        List<Integer> codes = Arrays.asList(40000, 40001, 40002, 40003, 40004, 40005, 40006, 40007, 40008, 40009, 40010, 40011, 40012, 40013, 40014, 50500);
//        Integer code = 40000;
//        System.out.println(codes.contains(code));

//
//        System.out.println("args = " + args);
//        Calendar calendar = Calendar.getInstance();
//
//        calendar.set(calendar.get(Calendar.YEAR), calendar.get(Calendar.MONTH), calendar.get(Calendar.DAY_OF_MONTH),
//                23, 59, 59);
//        Date date = calendar.getTime();
//        long time = date.getTime();
//        long l = System.currentTimeMillis();
//        Long currentTimeMillis = time-l;
//        System.out.println( currentTimeMillis / 1000 / 60/60);

//        Integer distance = 122;
//        //距离向上取整
//        Double ceil = Math.ceil(distance.doubleValue() / 1000);
//        ceil *= 1000;
//        distance = ceil.intValue();
//        System.out.println("ceil = " + distance);

//        Date date = new Date();
//        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
//        String format = sdf.format(date);
//        System.out.println(format);

    }
    public static Integer Multiply(String var1, String var2) {
        BigDecimal b1 = new BigDecimal(var1);
        BigDecimal b2 = new BigDecimal(var2);
        return b1.multiply(b2).setScale(0, BigDecimal.ROUND_HALF_UP).intValue();

    }

    public static void main1(String[] args) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.HOUR_OF_DAY, 0);
        calendar.set(Calendar.MINUTE, 0);
        calendar.set(Calendar.SECOND, 0);
        calendar.set(Calendar.MILLISECOND, 0);
        long startTime = calendar.getTime().getTime();

        System.out.println("startTime = " + startTime);
        calendar = Calendar.getInstance();
        calendar.set(Calendar.HOUR_OF_DAY, 23);
        calendar.set(Calendar.MINUTE, 59);
        calendar.set(Calendar.SECOND, 59);
        calendar.set(Calendar.MILLISECOND, 999);
        long endTime = calendar.getTime().getTime();
        System.out.println("endTime = " + endTime);


    }

}
