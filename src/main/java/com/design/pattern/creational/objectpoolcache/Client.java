package com.design.pattern.creational.objectpoolcache;

public class Client {
    public static void main(String[] args) {
        ConnectionPool<DbConnection> pool = new ConnectionPool<>(()-> new DbConnection(),  5);
        DbConnection con = pool.get();
        con.execute("");
        pool.release(con);
        
    }
}
