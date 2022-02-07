package com.company;

public class Dancer extends Person {
    String groupname;


    public Dancer(String name, String designation, String groupname) {
        super(name, designation);
        this.groupname = groupname;
    }
    void dancing(){
        System.out.println(" ysterday in ARLEN CLUB dancing dance ");
    }
    @Override
    public String toString(){
        return "group name"+groupname+" name  "+name+"designation "+ designation;
    }
}
