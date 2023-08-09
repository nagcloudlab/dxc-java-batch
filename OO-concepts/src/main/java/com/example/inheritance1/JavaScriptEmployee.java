package com.example.inheritance1;

public class JavaScriptEmployee extends Employee {

    private String[] javascriptSkills;

    public JavaScriptEmployee(int id, String name, int salary, String[] javascriptSkills) {
        super(id, name, salary);
        this.javascriptSkills = javascriptSkills;
    }

    public String[] getJavascriptSkills() {
        return javascriptSkills;
    }

    public void setJavascriptSkills(String[] javascriptSkills) {
        this.javascriptSkills = javascriptSkills;
    }
}
