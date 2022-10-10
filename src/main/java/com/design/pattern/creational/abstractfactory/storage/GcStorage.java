package com.design.pattern.creational.abstractfactory.storage;

public class GcStorage implements Storage{

    
    public GcStorage(String capacityInMb) {
        System.out.println("Allocate " + capacityInMb + " in google cloud storage");
    }
    @Override
    public String getId() {
        return "googlecloud_Storage";
    }
    
}
