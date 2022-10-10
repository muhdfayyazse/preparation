package com.design.pattern.creational.simplefactory;

import java.time.LocalDate;

public abstract class Post {
    private String id;
    private String title;
    private String content;
    private LocalDate createOn;
    private LocalDate publishOn;
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getContent() {
        return content;
    }
    public void setContent(String content) {
        this.content = content;
    }
    public LocalDate getCreateOn() {
        return createOn;
    }
    public void setCreateOn(LocalDate createOn) {
        this.createOn = createOn;
    }
    public LocalDate getPublishOn() {
        return publishOn;
    }
    public void setPublishOn(LocalDate publishOn) {
        this.publishOn = publishOn;
    }
    @Override
    public String toString() {
        return "Post [id=" + id + ", title=" + title + ", content=" + content + ", createOn=" + createOn
                + ", publishOn=" + publishOn + "]";
    }
    

    
    
}
