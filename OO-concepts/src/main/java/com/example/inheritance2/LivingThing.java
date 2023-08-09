package com.example.inheritance2;

/**
 * author : Nag
 */
public abstract class LivingThing {

    public void eat() {
        System.out.println("LT:eat()");
    }

    public final void sleep() {
        System.out.println("LT:sleep()");
    }

    //    public void work(){
//        System.out.println("LT:work()");
//    }
    public abstract void work();

}
