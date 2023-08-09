package com.example.inheritance2;

public class Application {
    public static void main(String[] args) {

        God god = new God();

        Human human = new Male();
        Animal animal = new Animal();
        Robot robot = new Robot();

//        god.manageHuman(human);
//        System.out.println();
//        god.manageAnimal(animal);


        god.manageLT(human);
        System.out.println();
        god.manageLT(animal);
        System.out.println();
        god.manageLT(robot);
        System.out.println();
        //god.manageLT(new LivingThing());

    }
}
