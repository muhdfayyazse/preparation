package com.design.pattern.creational.abstractfactory.instance;

import com.design.pattern.creational.abstractfactory.storage.Storage;

public class GoogleComputeInstance implements Instance{
    
    public GoogleComputeInstance(Instance.Capacity capacity) {
        System.out.println("Created Google Compute Instance");
    }

    @Override
    public void start() {
        System.out.println("Google Compute Instance is started");
        
    }

    @Override
    public void attachStorage(Storage storage) {
       System.out.println("Storage is attached to GC Instance");
    }


    @Override
    public void stop() {
        System.out.println("Google Compute Instance is stoped");
        
    }
    
}
