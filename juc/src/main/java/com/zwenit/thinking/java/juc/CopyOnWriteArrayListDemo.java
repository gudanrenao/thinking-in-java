package com.zwenit.thinking.java.juc;

import java.util.concurrent.CopyOnWriteArrayList;

/**
 * @author wen.zhang
 * @date 2020/8/12 13:39
 * @see java.util.concurrent.CopyOnWriteArrayList
 **/
public class CopyOnWriteArrayListDemo {

    public static void main(String[] args) {
        CopyOnWriteArrayList<Integer> cowList = new CopyOnWriteArrayList<Integer>();
        cowList.add(2);
        cowList.add(1);

        //允许null值
        cowList.add(null);
        System.out.println(cowList.contains(null)); //true

        //index 0~index之间，从后往前依次遍历查询
        System.out.println(cowList.lastIndexOf(null, 2));   //2
        System.out.println(cowList.lastIndexOf(null, 1));   //-1

    }
}
