package com.cys.service.cys;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.util.Base64;

/**
 * @author cys
 * @date 2019/6/19
 */
public class Demo3 {
    public static void main(String[] args) throws UnsupportedEncodingException {
        String encode = URLEncoder.encode("https://lcbqiniu.lechebangstatic.com/public/2019/6/18/8798e5f1a1c3023d6491524a18477e34.jpg", "UTF-8");
        System.out.println("encode = " + encode);
        String decode = URLDecoder.decode(encode, "ISO-8859-1");
        System.out.println("decode = " + decode);
//        String decode = URLDecoder.decode("https://lcbqiniu.lechebangstatic.com/public/2019/6/18/8798e5f1a1c3023d6491524a18477e34.jpg", "ISO-8859-1");
//        System.out.println("encode = " + decode);
//        System.out.println("s = " + decode);
    }
}
