package com.design.pattern.creational.factorymethod;

public class JsonMessageCreator extends MessageCreater{

    @Override
    public Message createMessage() {
        return new JsonMessage();
    }
    
}
