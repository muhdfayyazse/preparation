package com.design.pattern.creational.abstractfactory.storage;

public class S3Storage implements Storage{
    
    

    public S3Storage(String capacityInMb) {
        System.out.println("Allocate " + capacityInMb + " in s3 storage");
    }

    @Override
    public String getId() {
        return "s3_Storage";
    }
    
}
