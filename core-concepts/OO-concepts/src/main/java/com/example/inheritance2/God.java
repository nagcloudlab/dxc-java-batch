package com.example.inheritance2;

public class God {
//
//    public void manageHuman(Human human) {
//        human.eat();
//        human.sleep();
//        human.study();
//        human.work();
//    }
//
//    public void manageAnimal(Animal animal) {
//        animal.eat();
//        animal.sleep();
//        animal.work();
//    }

    // Open for extension & Closed for Modification
    public void manageLT(LivingThing lt) {
        lt.eat();
        lt.sleep();
        if(lt instanceof Human) {
            Human human = (Human) lt;
            human.study();
        }
        lt.work();
    }

}

// reference type casting
// Human ==> LivingThing  ( implicit )
// LivingThing ==> Human (if that LivingThing is Human)  ( explicit )
