package com.design.pattern.creational.abstractfactory.instance;

import com.design.pattern.creational.abstractfactory.storage.Storage;

public interface Instance {
    enum Capacity{micro, small, large};
    
    public abstract void start();
    public abstract void attachStorage(Storage storage);
    public abstract void stop();
}
