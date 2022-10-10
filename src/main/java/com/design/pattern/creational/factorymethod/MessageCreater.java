package com.design.pattern.creational.factorymethod;

public abstract class MessageCreater {
    
    public Message getMessage(){
        Message message = createMessage();
        message.addDefaultHeader();
        message.encrypt();
        return message;
    }

    public abstract Message createMessage();

}
