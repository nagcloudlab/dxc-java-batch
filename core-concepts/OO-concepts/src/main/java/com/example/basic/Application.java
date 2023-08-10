package com.example.basic;

public class Application {
    public static void main(String[] args) {

        Employee.tnrName = "Nag";
        Employee.doTeach();

        Employee e1 = new Employee(123);
        e1.setName("E1");
        e1.setSalary(1000.00);
        Employee e2 = new Employee(456, "E2");
        e2.setSalary(2000.00);
        Employee e3 = new Employee(789, "E3", 1000.00);

        e1.doLearn();
        System.out.println(e1.getSalary());
        e1.doLearn();


    }
}
