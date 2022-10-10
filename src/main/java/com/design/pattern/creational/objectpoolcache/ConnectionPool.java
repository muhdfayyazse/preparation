package com.design.pattern.creational.objectpoolcache;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.function.Supplier;

public class ConnectionPool<T extends Poolable> {
    private BlockingQueue<T> pool = new LinkedBlockingQueue<>();

    public ConnectionPool(Supplier<T> supplier, int count){
        for(int i= 0; i<count; i++){
            pool.offer(supplier.get());
        }
    }


    public T get(){
        try {
            return pool.take();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return null;
    }

    public void release( T obj){
        obj.reset();
        try {
            pool.put(obj);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
