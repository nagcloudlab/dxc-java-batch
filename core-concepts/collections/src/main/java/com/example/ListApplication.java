package com.example;


import com.example.model.Product;

import java.util.*;

public class ListApplication {
    public static void main(String[] args) {


        List<Product> products = new ArrayList<>();
        products.add(new Product(1, "iphone", 1000));
        products.add(new Product(2, "samsung", 2000));
        products.add(new Product(3, "huawei", 1000));
        products.add(new Product(4, "nokia", 4000));
        products.add(new Product(5, "motorola", 2000));

//        System.out.println(products.get(0));
//        products.set(0, new Product(6, "abc", 10));
//        System.out.println(products.get(0));
//        products.remove(0);

        //----------------------------------------------------------------

        // iterate / loop through products

        //way-1
//        Iterator<Product> iterator = products.iterator();
//        while (iterator.hasNext()) {
//            Product product = iterator.next();
//            System.out.println(product);
//        }

        // way-2 ( from java 1.5)
//        for (Product product : products) {
//            System.out.println(product);
//        }

        // ---------------------------------------------------------------------

        // sorting list collections

        // sorting is 2 step algorithm
        // step-1 : compare two elements
        // step-2 : swap two elements

        //Collections.sort(products);
        //Collections.sort(products,new ProductNameComparator());
        Collections.sort(products,(o1,o2)->o1.getName().compareTo(o2.getName()));
        for (Product product : products) {
            System.out.println(product);
        }
        //---------------------------------------------------------------------
    }
}
//
//class ProductNameComparator implements Comparator<Product> {
//    @Override
//    public int compare(Product o1, Product o2) {
//        return o1.getName().compareTo(o2.getName());
//    }
//}