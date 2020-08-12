package com.zwenit.thinking.java.generic;

/**
 * @author wen.zhang
 * @date 2020/8/5 10:31
 **/
public class Customer {

    private static long counter = 1;
    private final long id = counter++;

    private Customer() {
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                '}';
    }

    public static Generator<Customer> generator() {
        return () -> new Customer();
    }

    static class Teller {

        private static long counter = 1;
        private final long id = counter++;

        public static Generator<Teller> generator = Teller::new;

        private Teller() {
        }

        @Override
        public String toString() {
            return "Teller{" +
                    "id=" + id +
                    '}';
        }
    }

}
