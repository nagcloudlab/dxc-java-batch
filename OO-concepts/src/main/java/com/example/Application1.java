package com.example;

import com.example.access.p1.A;
import com.example.access.p1.B;
import com.example.access.p1.C;
import com.example.access.p2.D;
import com.example.access.p2.E;

public class Application1 {
    public static void main(String[] args) {

        Employee.tnrName = "Nag";
        Employee.doTeach();

        Employee e1 = new Employee(123);
        e1.setName("E1");
        e1.setSalary(1000.00);
        Employee e2 = new Employee(456, "E2");
        e2.setSalary(2000.00);
        Employee e3 = new Employee(789, "E3", 1000.00);

        e1.doLearn();
        System.out.println(e1.getSalary());
        e1.doLearn();


//        A a = new A();
//        a.aInstanceMethod();
//
//        B b = new B();
//        b.bInstanceMethod();

//        C c = new C();
//        c.cInstanceMethod();

//        D d = new D();
//        d.dInstanceMethod();

//        E e = new E();
//        e.eInstanceMethod();


    }
}
