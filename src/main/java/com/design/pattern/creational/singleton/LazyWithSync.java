package com.design.pattern.creational.singleton;

public class LazyWithSync {
    private static LazyWithSync INSTANCE;

    private LazyWithSync() {

    }

    public synchronized static LazyWithSync get() {
        if (INSTANCE == null) {
            INSTANCE = new LazyWithSync();
        }
        return INSTANCE;
    }
}