package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here
    }
}

class Person {
    String name;
    int age;
    String healthInfo;
    String getHealthStatus(){ return name +" " + healthInfo; }
    public Person(int age, String name, String healthInfo){
        this.name= name;
        this.age=age;
        this.healthInfo=healthInfo;
    }
}

class Child extends Person {
    String childIDNumber;
    public Child(int age, String name, String healthInfo, String childIDNumber){
        super(age, name, healthInfo);
        this.childIDNumber= childIDNumber;
    }
}

class Adult extends Person{
    String passportNumber;

    public Adult(int age, String name, String healthInfo, String passportNumber){
        super(age, name, healthInfo);
        this.passportNumber= passportNumber;
    }
}
