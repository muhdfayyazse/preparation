package com.design.pattern.structural.adapter;

public class BusinessCardDesigner {
    
    public BusinessCardDesigner(Customer customer){
        StringBuilder sb = new StringBuilder();
        sb.append(customer.getName()).append("\n");
        sb.append(customer.getDesignation()).append("\n");
        sb.append(customer.getAddress());  
        System.out.println(sb.toString());
    }


}
