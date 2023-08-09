package com.example;

import java.util.ArrayList;




public class Why_We_Need_Generics {
    public static void main(String[] args) {

        Box<String> box1 = new Box<String>();
        box1.addItem("Apple");
        box1.addItem("Mango");
        box1.addItem("Banana");
        System.out.println(box1.getItem(1));

        Box<Fruit> box2 = new Box<Fruit>();
        box2.addItem(new Fruit("Banana", 10.0,Color.YELLOW));
//        box2.addItem("Kiwi");
        box2.addItem(new Fruit("Mango", 20.0, Color.YELLOW));
        box2.addItem(new Fruit("Apple", 30.0, Color.GREEN));
        Fruit fruit = box2.getItem(1);
        System.out.println(fruit.getName() + "," + fruit.getPrice());


        ArrayList<Fruit> fruits = new ArrayList<Fruit>();
        fruits.add(new Fruit("Apple", 10.0,Color.RED));
        fruits.add(new Fruit("Mango", 20.0,Color.GREEN));
        fruits.add(new Fruit("Banana", 30.0,Color.YELLOW));
        Fruit f = fruits.get(1);
        System.out.println(f.getName() + "," + f.getPrice());


    }
}
