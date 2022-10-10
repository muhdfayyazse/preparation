package com.design.pattern.creational.simplefactory;

public class PostFactory {
    enum POST_TYPE{BLOGPOST,NEWSPOST,PRODUCTPOST}

    public static Post getPost(POST_TYPE postType){
        Post post = null;
        switch(postType){
            case BLOGPOST:
                post = new BlogPost();
                post.setTitle("Blog");
                break;
            case NEWSPOST:
                post = new NewsPost();
                post.setTitle("News");
                break;
            case PRODUCTPOST:
                post = new ProductPost();
                post.setTitle("Product");
                break;
            default:
                throw new IllegalArgumentException("Post Type is Known");
        }
        return post;
    }
}
