package com.design.pattern.creational.simplefactory;

import com.design.pattern.creational.simplefactory.PostFactory.POST_TYPE;

public class Client {
    public static void main(String[] args) {
        Post post  = PostFactory.getPost(POST_TYPE.PRODUCTPOST);
        System.out.println(post);
    }
}
