package com.design.pattern.creational.singleton;

public class Client {
    public static void main(String[] args) {
        //Eager
        Eager a = Eager.get();
        Eager b = Eager.get();
        System.out.println(a == b);


        LazyWithHolder lazyWithHolder = LazyWithHolder.get();
        
        EnumHolder f1 = EnumHolder.INSTANCE;
        EnumHolder f2 = EnumHolder.INSTANCE;
        System.out.println(f1== f2);
    }
}
