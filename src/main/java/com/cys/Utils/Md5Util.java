package com.cys.Utils;

import org.apache.commons.codec.digest.DigestUtils;

import java.io.*;
import java.math.BigInteger;
import java.security.MessageDigest;
 
public class Md5Util {
 
    private static MessageDigest md5;
 
    static {
        try {
            md5 = MessageDigest.getInstance("MD5");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
 
    public static String getMd5(String string) {
        try {
            byte[] bs = md5.digest(string.getBytes("UTF-8"));
            StringBuilder sb = new StringBuilder(40);
            for (byte x : bs) {
                if ((x & 0xff) >> 4 == 0) {
                    sb.append("0").append(Integer.toHexString(x & 0xff));
                } else {
                    sb.append(Integer.toHexString(x & 0xff));
                }
            }
            return sb.toString();
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException(e);
        }
    }
 
//方式一: 不需要第三方依赖
//    public static String getMD5(File file) {
//        if (!file.isFile()) {
//            throw new RuntimeException(file.getName() + "is not a file!");
//        }
//        MessageDigest digest;
//        byte buffer[] = new byte[1024];
//        int len;
//        try (FileInputStream in = new FileInputStream(file)) {
//            digest = MessageDigest.getInstance("MD5");
//            while ((len = in.read(buffer, 0, 1024)) != -1) {
//                digest.update(buffer, 0, len);
//            }
//        } catch (Exception e) {
//            throw new RuntimeException(e);
//        }
//        BigInteger bigInt = new BigInteger(1, digest.digest());
//        //补全位数, 解决上个版本前面为0时会丢弃
//        StringBuilder md5Str = new StringBuilder(bigInt.toString(16));
//        while (md5Str.length() < 32)
//            md5Str.insert(0, "0");
//        return md5Str.toString();
//    }
//方式二: 调用commons-codec的接口
//    public static String getMD5(File file) {
//        try (FileInputStream fileInputStream = new FileInputStream(file)){
//            return DigestUtils.md5Hex(IOUtils.toByteArray(fileInputStream));
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }
//    }
//
    public static void main(String[] args) throws Exception {
        System.out.println(getMd5("Lechebang123!"));
      //  System.out.println(getMD5(new File("/home/leen/agent-1.0.11.zip")));
    }
}