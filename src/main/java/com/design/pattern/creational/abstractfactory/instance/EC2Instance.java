package com.design.pattern.creational.abstractfactory.instance;

import com.design.pattern.creational.abstractfactory.storage.Storage;

public class EC2Instance implements Instance{



    
    public EC2Instance(Instance.Capacity capacity) {
        System.out.println("Created EC2Instance");
    }

    @Override
    public void start() {
        System.out.println("EC2 Instance is started");
        
    }

    
    @Override
    public void stop() {
        System.out.println("EC2 Instance is stoped");
    }

    @Override
    public void attachStorage(Storage storage) {
       System.out.println("Storage is attached to Ec2 Instance");
    }


    
}
