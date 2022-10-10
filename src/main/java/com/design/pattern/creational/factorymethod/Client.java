package com.design.pattern.creational.factorymethod;


public class Client {
    public static void main(String[] args) {
        printMessage(new JsonMessageCreator()); 
        System.out.println("****************************************");
        printMessage(new TextMessageCreator()); 
    }

    public static void printMessage(MessageCreater creater){
        Message msg = creater.getMessage();
        System.out.println(msg);
    }
}
