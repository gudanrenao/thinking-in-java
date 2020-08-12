package com.zwenit.thinking.java.generic;

/**
 * @author wen.zhang
 * @date 2020/8/5 10:29
 **/
@FunctionalInterface
public interface Generator<T> {

    T next();
}
