package com.zwenit.thinking.java.generic;

/**
 * @author wen.zhang
 * @date 2020/8/5 9:23
 **/
public class TupleUtils {

    public static <A, B> TwoTuple<A, B> tuple(A a, B b) {
        return new TwoTuple<>(a, b);
    }

    public static <A, B, C> ThreeTuple<A, B, C> tuple(A a, B b, C c) {
        return new ThreeTuple<>(a, b, c);
    }

    private static class TupleUtilsTest {

        public TwoTuple twoTupleTest() {
            return TupleUtils.tuple("122", 2);
        }
    }
}
