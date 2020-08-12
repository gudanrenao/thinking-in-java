package com.zwenit.thinking.java.generic;

/**
 * @author wen.zhang
 * @date 2020/8/3 13:35
 **/
public class GenericMethodDemo {

    private static <A, B> void demo(A a, B b) {
        System.out.println("a is :　" + a + ", b is : " + b);
    }

    public static void main(String[] args) {
        demo(new User("zw", 18), 100);
    }
}
