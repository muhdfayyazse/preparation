package com.design.pattern.creational.singleton;

public class Eager {
    private static Eager INSTANCE = new Eager();
    private Eager(){

    }
    
    public static Eager get(){
        return INSTANCE;
    }
}
