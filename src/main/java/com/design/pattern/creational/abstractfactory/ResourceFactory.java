package com.design.pattern.creational.abstractfactory;

import com.design.pattern.creational.abstractfactory.instance.Instance;
import com.design.pattern.creational.abstractfactory.storage.Storage;

public interface ResourceFactory {
    Instance createInstance(Instance.Capacity capacity);
    Storage createStorage(String capacityInMb);
}
