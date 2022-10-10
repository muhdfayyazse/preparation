package com.design.pattern.creational.objectpoolcache;

public interface Connection extends Poolable {
    void execute(String query);
}
