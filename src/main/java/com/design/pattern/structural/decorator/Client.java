package com.design.pattern.structural.decorator;

public class Client {
    public static void main(String[] args) {
        Message msg  = new TextMessage();
        System.out.println(msg);

        Message decorator = new HtmlEncodedDecorator(msg);
        System.out.println(decorator.getContent());

        decorator = new Base64EncodedDecorator(decorator);
        System.out.println(decorator.getContent());
    }
}
