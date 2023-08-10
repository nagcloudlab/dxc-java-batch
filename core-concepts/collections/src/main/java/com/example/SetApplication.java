package com.example;

import com.example.model.Product;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetApplication {
    public static void main(String[] args) {

        // set => unique

//        //Set<String> set = new TreeSet<>();
//        //Set<String> set = new HashSet<>();
//        Set<String> set=new LinkedHashSet<>();
//        set.add("A");
//        set.add("C");
//        set.add("D");
//        set.add("B");
//        set.add("C");
//        set.add("Z");
//        set.add("P");
//
//        System.out.println(set);


        Set<Product> products = new TreeSet<>((o1,o2)->{
            return o1.getName().compareToIgnoreCase(o2.getName());
        });
        products.add(new Product(1, "iphone", 1000));
        products.add(new Product(2, "samsung", 2000));
        products.add(new Product(3, "huawei", 1000));
        products.add(new Product(4, "nokia", 4000));
        products.add(new Product(5, "motorola", 2000));

        for (Product product : products) {
            System.out.println(product);
        }


    }
}
