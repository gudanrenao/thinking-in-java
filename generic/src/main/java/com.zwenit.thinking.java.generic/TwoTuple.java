package com.zwenit.thinking.java.generic;

import java.lang.reflect.TypeVariable;

/**
 * @author wen.zhang
 * @date 2020/8/3 10:54
 **/
public class TwoTuple<A, B> {

    public final A a;
    public final B b;

    public TwoTuple(A a, B b) {
        this.a = a;
        this.b = b;
    }

    public A getA() {
        return a;
    }

    public B getB() {
        return b;
    }

    @Override
    public String toString() {
        return "TwoTuple{" +
                "a=" + a +
                ", b=" + b +
                '}';
    }

    public static void main(String[] args) {
        TwoTuple<String, Integer> twoTuple = getTwoTuple("hello world", 1);
        System.out.println(twoTuple);

        TypeVariable<? extends Class<? extends TwoTuple>>[] typeVariables = twoTuple.getClass().getTypeParameters();
        System.out.println(typeVariables);

    }

    private static TwoTuple<String, Integer> getTwoTuple(String a, Integer b) {
        return new TwoTuple<String, Integer>("this is " + a, b * 100);
    }
}
