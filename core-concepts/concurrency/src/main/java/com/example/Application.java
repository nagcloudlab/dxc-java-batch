package com.example;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {


        Thread ioThread = new Thread(Application::io,"T1");
        Thread computationThread = new Thread(Application::computation,"T2");

        ioThread.start();
        computationThread.start();


    }

    private static void io() {
        String threadName = Thread.currentThread().getName();
        System.out.println(threadName + " started io");
        System.out.println("enter your name");
        Scanner sc = new Scanner(System.in);
        String userName = sc.nextLine();
        System.out.println("Hello " + userName);
        System.out.println(threadName + " finished io");
    }

    private static void computation() {
        String threadName = Thread.currentThread().getName();
        System.out.println(threadName + " started computation");
        for (int i = 1; i <= 100; i++) {
            System.out.println(threadName + "->" + i);
        }
        System.out.println(threadName + " finished computation");
    }
}
