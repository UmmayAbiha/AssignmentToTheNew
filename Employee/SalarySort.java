package com.example.Employee;

import java.util.Comparator;

class SalarySort implements Comparator<Employee> {
    public int compare(Employee e1, Employee e2){
        return e1.Salary.compareTo(e2.Salary);
    }
}
