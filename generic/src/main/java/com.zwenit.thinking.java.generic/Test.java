package com.zwenit.thinking.java.generic;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;

/**
 * @author wen.zhang
 * @date 2020/8/5 11:10
 **/
public class Test {


    public static void main(String[] args) throws UnsupportedEncodingException {
        String encode = URLEncoder.encode("1,2,3", StandardCharsets.UTF_8.displayName());
        System.out.println(encode);
    }

}
