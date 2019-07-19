import org.apache.commons.lang.time.DateUtils;
import org.springframework.scheduling.annotation.Async;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * @author chenyushi
 * @date 2019/2/11
 */
public class Demo {
    private final static SimpleDateFormat s = new SimpleDateFormat("yyyy-MM-dd");
    public static void main(String[] args) {

        Calendar c = Calendar.getInstance();
        c.add(Calendar.MONTH, -1);
        //设置为1号,当前日期既为本月第一天
        c.set(Calendar.DAY_OF_MONTH, 1);
        //将小时至0
        c.set(Calendar.HOUR_OF_DAY, 0);
        //将分钟至0
        c.set(Calendar.MINUTE, 0);
        //将秒至0
        c.set(Calendar.SECOND,0);
        //将毫秒至0
        c.set(Calendar.MILLISECOND, 0);
        // 获取本月第一天的时间戳
        Date date = new Date(c.getTimeInMillis());
        String format = s.format(date);
        System.out.println("开始时间"+ format);


        //获取当前月最后一天
        Calendar ca = Calendar.getInstance();
        ca.add(Calendar.MONTH, -1);
        ca.set(Calendar.DAY_OF_MONTH, ca.getActualMaximum(Calendar.DAY_OF_MONTH));
        //将小时至0
        ca.set(Calendar.HOUR_OF_DAY, 23);
        //将分钟至59
        ca.set(Calendar.MINUTE, 59);
        //将秒至59
        ca.set(Calendar.SECOND,59);
        //将毫秒至999
        ca.set(Calendar.MILLISECOND, 999);
        // 获取本月最后一天的时间戳
        System.out.println("结束时间 = " + ca.getTimeInMillis());

    }


    @Async
    public String test1(String s){


        String json = "{\"lcb_request_id\":\"9c03beb1-6c0a-43b4-b175-7905cfd7bbc3\",\"appCode\":302,\"groupType\":0,\"placeId\":null,\"storeId\":null,\"orderNumber\":null,\"userMobile\":null,\"orderStatus\":null,\"paymentStatus\":null,\"rePlacePayStatus\":null,\"providerId\":null,\"endCreatedTime\":null,\"page\":{\"currentPage\":1,\"pageSize\":1,\"totalCount\":0,\"pageSizeOptions\":[10,20,50],\"orderBy\":\"id desc\"},\"startCreatedTime\":null}";
        String j  = "{\"lcb_request_id\":\"9c03beb1-6c0a-43b4-b175-7905cfd7bbc3\",\"appCode\":302,\"groupType\":0,\"placeId\":null,\"storeId\":null,\"orderNumber\":null,\"userMobile\":null,\"orderStatus\":null,\"paymentStatus\":null,\"rePlacePayStatus\":null,\"providerId\":null,\"endCreatedTime\":null,\"page\":{\"currentPage\":1,\"pageSize\":1,\"totalCount\":0,\"pageSizeOptions\":[10,20,50],\"orderBy\":\"id desc\"},\"startCreatedTime\":null}";
        return j;
    }
}
