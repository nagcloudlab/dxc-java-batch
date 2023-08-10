package com.example;

import com.example.model.Car;
import com.example.model.Owner;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapCollection {
    public static void main(String[] args) {

//        Map<Integer, String> map = new TreeMap<>();
//        map.put(12, "Nag");
//        map.put(34, "Indu");
//        map.put(56, "Riya");
//        map.put(78, "Dhiya");
//
//        System.out.println(map.get(56));


        Owner owner1 = new Owner("Riya");
        Owner owner2 = new Owner("Diya");

        Car car1=new Car("model1","yellow");
        Car car2=new Car("model2","pink");

        Map<Owner,Car> map = new HashMap<>();
        map.put(owner1,car1);
        map.put(owner2,car2);


        //---------------------------------------

        Car car=map.get(owner1);
        System.out.println(car);

        //---------------------------------------
    }
}
