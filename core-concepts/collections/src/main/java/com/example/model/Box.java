package com.example.model;


public class Box<E> {
    Object[] items = new Object[10];
    int index = -1;

    public void addItem(E item) {
        index++;
        items[index] = item;
    }

    public E getItem(int index) {
        return (E) items[index];
    }
}