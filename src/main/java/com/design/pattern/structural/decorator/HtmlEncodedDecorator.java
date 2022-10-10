package com.design.pattern.structural.decorator;

public class HtmlEncodedDecorator implements Message{
    
    private Message msg;

    public HtmlEncodedDecorator(Message msg) {
        this.msg = msg;
    }

    @Override
    public String getContent() {
        return "Html Encoded [" + msg.getContent()+"]";
    }
    
}
