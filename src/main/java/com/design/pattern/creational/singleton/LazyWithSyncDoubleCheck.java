package com.design.pattern.creational.singleton;

public class LazyWithSyncDoubleCheck {
    private static LazyWithSyncDoubleCheck INSTANCE;

    private LazyWithSyncDoubleCheck() {

    }

    public static LazyWithSyncDoubleCheck get() {
        if (INSTANCE == null) {
            synchronized (LazyWithSyncDoubleCheck.class) {
                if (INSTANCE == null) {
                    INSTANCE = new LazyWithSyncDoubleCheck();
                }
            }
        }
        return INSTANCE;
    }
}
