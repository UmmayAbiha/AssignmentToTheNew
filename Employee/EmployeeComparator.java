package com.example.Employee;

public class EmployeeComparator implements Comparator<Employee> {
    public int compare(Employee e1, Employee e2) {
        if (e1.Salary > e2.Salary) {
            return 1;
        } else if (e1.Salary < e2.Salary) {
            return -1;
        } else {
            return 0;
        }
    }
}