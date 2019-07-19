package com.cys.cys;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

/**
 * @author chenyushi
 * @date 2019/2/12
 */
@Component
public class AsyncTest {
    @Async
    public  void testAsyncMethod(){
        try {
            //让程序暂停10秒，相当于执行一个很耗时的任务
            Thread.sleep(10000);
            System.out.println("10秒后我被执行");
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
