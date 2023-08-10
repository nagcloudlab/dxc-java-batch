package com.example;

public class ValueTypeCasting {
    public static void main(String[] args) {


        int a=6;
        int b=4;
        float c=(float) a/b;

        byte byteVar=12;
        int intVar=byteVar;  // implicit
        byteVar=(byte) intVar; // explicit

        // Quiz
        int i=456;
        byte byteV=(byte) i;  // -128 to 0,-127 ==> 256 , 456-256=200= -56

        for(int j=0;j<127;j++){
            System.out.println(j+"->"+(char)j);
        }


    }
}
