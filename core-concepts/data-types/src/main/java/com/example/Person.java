package com.example;

//import java.lang.*; // implicit import

public class Person {

    // obj' state variables
    public String name; // Reference Var defaults to null
    public int  age; // Primitive Var defaults to 0

    // constructor
    public Person(){}

    // obj's behvav
    public void sayName(){
        System.out.println("im "+name);
    }
    public void sayAge(){
        System.out.println("im "+age+" yrs old");
    }

}
