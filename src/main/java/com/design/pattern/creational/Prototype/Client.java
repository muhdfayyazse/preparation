package com.design.pattern.creational.Prototype;

public class Client {	public static void main(String[] args) throws CloneNotSupportedException {
    Swordsman s1 = new Swordsman();
    s1.move(10D, 20F);
    s1.attack();
    
    System.out.println(s1);
    Swordsman s2 = (Swordsman)s1.clone();
    System.out.println("Cloned swordsman"+s2);
    
}
}
