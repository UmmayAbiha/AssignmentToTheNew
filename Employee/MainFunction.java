//Question 2

package com.example.Employee;

import java.util.ArrayList;
import java.util.Collections;

public class MainFunction {
    public static void main(String[] args)
    {
        ArrayList<Employee> list = new ArrayList<Employee>();

        list.add(new Employee(20.0, 7000.0, "John Sharma"));
        list.add(new Employee(30.0, 2000.0, "Zara Khan"));
        list.add(new Employee(40.0, 6000.0, "Loe Fom"));
        list.add(new Employee(50.0, 1000.0, "Steve Jobs"));
        list.add(new Employee(60.0, 5000.0, "Bill"));

        System.out.println("On basis of salary: ");

        Collections.sort(list, new SalarySort());
        for (Employee e : list) {
            System.out.println(e.Name + " " + e.Salary);
        }

        System.out.println();

        System.out.println("On the basis of name :" );

        Collections.sort(list, new NameSort());
        for (Employee e : list) {
            System.out.println(e.Name + " " + e.Salary);
        }

    }
}