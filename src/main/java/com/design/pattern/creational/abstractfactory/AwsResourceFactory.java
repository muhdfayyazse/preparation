package com.design.pattern.creational.abstractfactory;

import com.design.pattern.creational.abstractfactory.instance.EC2Instance;
import com.design.pattern.creational.abstractfactory.instance.Instance;
import com.design.pattern.creational.abstractfactory.instance.Instance.Capacity;
import com.design.pattern.creational.abstractfactory.storage.S3Storage;
import com.design.pattern.creational.abstractfactory.storage.Storage;

public class AwsResourceFactory implements ResourceFactory{

    @Override
    public Instance createInstance(Capacity capacity) {
        return new EC2Instance(capacity);
    }

    @Override
    public Storage createStorage(String capacityInMb) {
        return new S3Storage(capacityInMb);
    }
    
}
