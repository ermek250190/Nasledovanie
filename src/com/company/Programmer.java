package com.company;

public class Programmer extends Person   {
    String companyname;


    public Programmer(String name, String designation, String companyname) {
        super(name, designation);
        this.companyname = companyname;
    }
    void coding(){
        System.out.println("programmer like to coding,coding it is live for programmer");
    }
    @Override
    public String toString () {
        return " name company:" + companyname + "name: " + name + "designation: " + designation;
    }
}
