package com.design.pattern.structural.adapter;

public class Client {
    public static void main(String[] args) {
        Employee emp = new Employee();
        populateAdaptee(emp);
        EemployeeAdapter adapter = new EemployeeAdapter(emp);
        BusinessCardDesigner businessCardDesigner = new BusinessCardDesigner(adapter);
    }

    private static void populateAdaptee(Employee emp){
        emp.setFullName("Muhammad Fayyaz");
        emp.setJobTitle("Java Lead");
        emp.setOfficeLocation("Abu Dhabi");
    }
}
