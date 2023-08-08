package com.example;

public class ObjectTypes {
    public static void main(String[] args) {

        var p1=new Person();
        p1.name="Riya";
        p1.age=8;

        var p2=new Person();
        p2.name="Dhiya";
        p2.age=5;

        p1.sayName();
        p1.sayAge();

        p2.sayName();
        p2.sayAge();

    }
}
