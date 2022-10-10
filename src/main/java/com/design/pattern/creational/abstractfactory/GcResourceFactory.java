package com.design.pattern.creational.abstractfactory;

import com.design.pattern.creational.abstractfactory.instance.GoogleComputeInstance;
import com.design.pattern.creational.abstractfactory.instance.Instance;
import com.design.pattern.creational.abstractfactory.instance.Instance.Capacity;
import com.design.pattern.creational.abstractfactory.storage.GcStorage;
import com.design.pattern.creational.abstractfactory.storage.Storage;

public class GcResourceFactory implements ResourceFactory{

    @Override
    public Instance createInstance(Capacity capacity) {
        return new GoogleComputeInstance(capacity);
    }

    @Override
    public Storage createStorage(String capacityInMb) {
        return new GcStorage(capacityInMb);
    }
    
}
