package com.example.inheritance2;

public class Robot extends LivingThing{

    @Override
    public void eat() {
        System.out.println("Robot::eat");
    }

    @Override
    public final void work() {
        System.out.println("Robot::work");
    }

}
