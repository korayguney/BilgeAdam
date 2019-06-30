package com.example.kguney.bilgeadam_28_p2;

import java.io.Serializable;

/**
 * Created by kguney on 29.06.2019.
 */

public class Employee implements Serializable{

    private String name;
    private int age;
    private double salary;
    private boolean isMarried;

    public Employee() {
    }

    public Employee(String name, int age, double salary, boolean isMarried) {
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.isMarried = isMarried;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public boolean isMarried() {
        return isMarried;
    }

    public void setMarried(boolean married) {
        isMarried = married;
    }
}
