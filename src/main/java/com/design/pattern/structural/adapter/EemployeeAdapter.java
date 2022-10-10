package com.design.pattern.structural.adapter;

public class EemployeeAdapter implements Customer{
    private Employee employee;

    public EemployeeAdapter(Employee employee) {
        this.employee = employee;
    }

    @Override
    public String getName() {
        return this.employee.getFullName();
    }

    @Override
    public String getDesignation() {
        return this.employee.getJobTitle();    }

    @Override
    public String getAddress() {
        return this.employee.getOfficeLocation();
    }
}
