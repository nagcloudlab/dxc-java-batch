package com.example;

/*

    signed data-types

    -2^n-1 to -2^n-1 -n ==> number bits
    byte => 8, -128 to 127

 */

public class ValueTypes {
    public static void main(String[] args) {


        byte byteVar=-127;
        short shotVar=1212;
        int intVar=12121212;
        long longVar=121212121212L;

        float floatVar=12.12F;

        char charVar1='A';
        char charVar2=65;
        char charVar3='\u0041';

        boolean booleanVar=true;

        int i1=010;
        int i2=0x10;
        int i3=0b10;

        long n=1212_1313_1414L;

    }
}
