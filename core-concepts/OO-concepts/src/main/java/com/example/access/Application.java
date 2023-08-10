package com.example.access;

import com.example.access.p1.A;
import com.example.access.p1.B;
import com.example.access.p1.C;
import com.example.access.p2.D;
import com.example.access.p2.E;

public class Application {
    public static void main(String[] args) {

        A a = new A();
        a.aInstanceMethod();

        B b = new B();
        b.bInstanceMethod();

        C c = new C();
        c.cInstanceMethod();

        D d = new D();
        d.dInstanceMethod();

        E e = new E();
        e.eInstanceMethod();

    }
}
