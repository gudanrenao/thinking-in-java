package com.zwenit.thinking.java.generic;

/**
 * 链表结构 Stack 2
 * <p>
 * 使用非静态内部类：可用外部类的泛型参数
 *
 * @author wen.zhang
 * @date 2020/8/3 11:42
 **/
public class LinkedStack2<T> {

    //End sentinel
    private Node top = new Node();

    public void push(T item) {
        this.top = new Node(item, top);
    }

    public T pop() {
        T item = top.item;
        if (!top.end()) {
            top = top.next;
        }
        return item;
    }

    private class Node {

        T item;
        Node next;

        public Node() {
            this.item = null;
            this.next = null;
        }

        public Node(T item, Node next) {
            this.item = item;
            this.next = next;
        }

        boolean end() {
            return item == null && next == null;
        }
    }


    public static void main(String[] args) {
        LinkedStack2<String> lss = new LinkedStack2<>();
        for (String s : "Phasers or stun!".split(" ")) {
            lss.push(s);
        }
        String s;
        while ((s = lss.pop()) != null) {
            System.out.println(s);
        }
    }
}
