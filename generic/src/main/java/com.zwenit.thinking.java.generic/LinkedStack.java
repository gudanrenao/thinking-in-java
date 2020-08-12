package com.zwenit.thinking.java.generic;

/**
 * 链表结构 Stack
 *
 * @author wen.zhang
 * @date 2020/8/3 11:42
 **/
public class LinkedStack<T> {

    //End sentinel
    private Node<T> top = new Node<>();

    public void push(T item) {
        this.top = new Node<>(item, top);
    }

    public T pop() {
        T item = top.item;
        if (!top.end()) {
            top = top.next;
        }
        return item;
    }

    private static class Node<T> {

        T item;
        Node<T> next;

        public Node() {
            this.item = null;
            this.next = null;
        }

        public Node(T item, Node<T> next) {
            this.item = item;
            this.next = next;
        }

        boolean end() {
            return item == null && next == null;
        }
    }


    public static void main(String[] args) {
        LinkedStack<String> lss = new LinkedStack<>();
        for (String s : "Phasers or stun!".split(" ")) {
            lss.push(s);
        }
        String s;
        while ((s = lss.pop()) != null) {
            System.out.println(s);
        }
    }
}
