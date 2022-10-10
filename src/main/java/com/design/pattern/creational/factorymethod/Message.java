package com.design.pattern.creational.factorymethod;

public abstract class Message {
    
    public abstract String getConten();

    public void addDefaultHeader(){
        System.out.println("Added default header");
    }
    
    public void encrypt(){
        System.out.println("Message Encrypted");
    }
}
