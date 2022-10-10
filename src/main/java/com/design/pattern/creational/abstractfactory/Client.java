package com.design.pattern.creational.abstractfactory;

import com.design.pattern.creational.abstractfactory.instance.Instance;
import com.design.pattern.creational.abstractfactory.storage.Storage;

public class Client {
    public static void main(String[] args) {
        ResourceFactory aws = new AwsResourceFactory();
        Instance ec2  = aws.createInstance(Instance.Capacity.micro);
        Storage s3  = aws.createStorage("");
        ec2.start();
        ec2.attachStorage(s3);
        ec2.stop();

        ResourceFactory gcR = new GcResourceFactory();
        Instance gc  = gcR.createInstance(Instance.Capacity.micro);
        Storage gcS  = gcR.createStorage("");
        gc.start();
        gc.attachStorage(gcS);
        gc.stop();



    }
}
