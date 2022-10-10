package com.design.pattern.creational.factorymethod;

public class TextMessageCreator extends MessageCreater{

    @Override
    public Message createMessage() {
        return new TextMessage();
    }
    
}