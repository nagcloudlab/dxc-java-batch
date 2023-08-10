package com.example.inheritance1;

public class JavaEmployee extends Employee {
    private String[] javaSkills;

    public JavaEmployee(int id, String name, int salary, String[] javaSkills) {
        super(id, name, salary);
        this.javaSkills = javaSkills;
    }

    public String[] getJavaSkills() {
        return javaSkills;
    }

    public void setJavaSkills(String[] javaSkills) {
        this.javaSkills = javaSkills;
    }
}
