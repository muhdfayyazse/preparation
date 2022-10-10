package com.design.pattern.creational.singleton;

public class Lazy {
    private static Lazy INSTANCE;
    private Lazy(){

    }
    
    public static Lazy get(){
        if(INSTANCE == null){
            INSTANCE = new Lazy();
        }
        return INSTANCE;
    }
}
