package com.zwenit.thinking.java.generic;

import java.time.LocalDateTime;

/**
 * @author wen.zhang
 * @date 2020/8/3 10:58
 **/
public class ThreeTuple<A, B, C> extends TwoTuple<A, B> {

    public final C c;

    public ThreeTuple(A a, B b, C c) {
        super(a, b);
        this.c = c;
    }

    public C getC() {
        return c;
    }

    @Override
    public String toString() {
        return "ThreeTuple{" +
                "c=" + c +
                ", a=" + a +
                ", b=" + b +
                '}';
    }


    public static void main(String[] args) {
        ThreeTuple<String, Integer, LocalDateTime> threeTuple = getThreeTuple("hello world", 1);
        System.out.println(threeTuple);
    }

    private static ThreeTuple<String, Integer, LocalDateTime> getThreeTuple(String a, Integer b) {
        return new ThreeTuple<String, Integer, LocalDateTime>("this is " + a, b * 100, LocalDateTime.now());
    }
}
