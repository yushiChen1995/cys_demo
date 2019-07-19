package com.cys.cys;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author chenyushi
 * @date 2019/2/12
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext.xml")
@EnableAsync
public class Ctest {
    @Autowired
    AsyncTest asyncTest;

    @Test
    public void name() {
        asyncTest.testAsyncMethod();
        System.out.println("我已经执行了！");
    }
}
