package com.example.Employee;

import java.util.Comparator;

public class NameSort implements Comparator<Employee> {
    public int compare(Employee e1, Employee e2){
        return e1.Name.compareTo(e2.Name);
    }
}
