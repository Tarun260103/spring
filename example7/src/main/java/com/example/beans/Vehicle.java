package com.example.beans;



public class Vehicle {
    public Vehicle(){
        System.out.println("Vehical bean created by spring");
    }
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void printHello(){
        System.out.println("printing Hello From component Vehicle bean");
    }
}
