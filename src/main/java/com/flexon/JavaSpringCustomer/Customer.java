package com.flexon.JavaSpringCustomer;

public class Customer{
    private final String customerid;
    private String firstName;
    private String lastName;
    private String phoneNumber;

    public Customer(String customerid, String firstName, String lastName, String phoneNumber){
        this.firstName = firstName;
        this.lastName = lastName;
        this.customerid = customerid;
        this.phoneNumber = phoneNumber;
    }

    public String getCustomerid() {
        return customerid;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}