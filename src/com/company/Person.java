package com.company;

public class Person {
    String name;
    String designation;

    public Person() {
    }

    public Person(String name, String designation) {
        this.name = name;
        this.designation = designation;

    }

    void learn(){
        System.out.println(" programmer in company peaksoft learn java");
    }
    void walk(){
        System.out.println(" programmer every day walk in park ");
    }
    void eat (){
        System.out.println("programmer like to aet in time coding  ");
    }

    @Override
    public String toString() {
        return "  name "+name+" designation  "+designation;
    }
}
