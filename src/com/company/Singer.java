package com.company;


public class Singer extends Person{
    String bandname;


    public Singer(String name, String designation, String bandname) {
        super(name, designation);
        this.bandname = bandname;

    }
    void singer(){
        System.out.println("Arlen is wery good singer all world");
    }
    @Override
    public String toString() {
        return " music group " + bandname+" name "+name+" designation "+designation;
    }
}

