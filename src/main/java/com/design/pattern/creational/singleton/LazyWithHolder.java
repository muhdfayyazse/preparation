package com.design.pattern.creational.singleton;

public class LazyWithHolder {
    

    private LazyWithHolder() {
        System.out.println("constructor");
    }

    private static class LazyInnerHolder{
        private static LazyWithHolder INSTANCE = new LazyWithHolder();
    }



    public static LazyWithHolder get() {
        return LazyInnerHolder.INSTANCE;
    }    
}
