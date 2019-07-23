package com.cys.service.cys;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.cys.pojo.ViolPlaceMap;

import java.util.List;
import java.util.Map;

/**
 * @author cys
 * @date 2019/6/14
 */
public class Demo2 {

    public static void main(String[] args) {

        String json = "[\n" +
                "{\"province\":\"北京\"},\n" +
                "{\"province\":\"河北\"},\n" +
                "{\"province\":\"山西\"},\n" +
                "{\"province\":\"辽宁\"},\n" +
                "{\"province\":\"浙江\"},\n" +
                "{\"province\":\"山东\"},\n" +
                "{\"province\":\"湖南\"},\n" +
                "{\"province\":\"广西\"},\n" +
                "{\"province\":\"海南\"},\n" +
                "{\"province\":\"云南\"},\n" +
                "{\"province\":\"甘肃\"},\n" +
                "{\"province\":\"青海\"},\n" +
                "{\"province\":\"宁夏\"},\n" +
                "{\"province\":\"新疆\"}\n" +
                "]";

        List<Map> meterList= JSONArray.parseArray(json,Map.class);
        for (Map map : meterList) {
            if (map.get("province").equals("北京")) {
                System.out.println("包含北京");
            }
        }

    }
}
