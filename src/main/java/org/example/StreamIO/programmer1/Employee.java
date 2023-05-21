package org.example.StreamIO.programmer1;

import java.io.Serializable;

public class Employee implements Serializable {

    String name;
    String department;
    int age;

    public Employee(String name, String department, int age) {
        this.name = name;
        this.department = department;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", department='" + department + '\'' +
                ", age=" + age +
                '}';
    }
}
