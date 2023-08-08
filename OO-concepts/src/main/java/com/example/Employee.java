package com.example;

public class Employee {

    // class/static variable(s)
    public final static String COMPANY_NAME = "dxc";
    public static String tnrName;
    public static String notes = null;

    // object/instance variable(s)
    private int id;
    private String name;
    private double salary;

    // constructor(s)
    public Employee(int id) {
        this(id, null, 0.0);
    }

    public Employee(int id, String name) {
        this(id, name, 0.0);
    }

    public Employee(int id, String name, double salary) {
        if (id > 0) {
            this.id = id;
        }
        if (name != null) {
            this.name = name;
        }
        if (salary > 0 && salary < 1000000) {
            this.salary = salary;
        }
    }

    // Methods

    // accessor methods a.k.a set/get

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name != null)
            this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        if (salary > 0 && salary < 1000.00)
            this.salary = salary;
    }

    // class/static method(s)
    public static void doTeach() {
        System.out.println(tnrName + " teaching java");
        notes = "Java-Notes";
    }

    // object/instance
    public void doLearn() {
        System.out.println(name + " learning " + notes + " given by " + tnrName);
        this.salary = this.salary + (this.salary * 0.02);
    }


}
