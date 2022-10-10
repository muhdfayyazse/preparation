package com.design.pattern.creational.objectpoolcache;

public class DbConnection implements Connection{
    private String connection = "idle";


    @Override
    public void reset() {
        this.connection = "idle";
        System.out.println("reset");
        
    }

    @Override
    public void execute(String query) {
        this.connection = "executing ...";
        System.out.println(this.connection);
    }
}