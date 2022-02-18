//Question 4

package com.example.Hashmap;

import java.util.HashMap;
import java.util.Map;

public class MainFunction {
    public static void main(String args[])
    {
        HashMap<Employee, Double> map = new HashMap<>();
        map.put(new Employee("Minal", 25, "CEO"), 100000.0);
        map.put(new Employee("Raj", 30, "Manager"), 20000.0);
        map.put(new Employee("Ravi", 35, "Developer"), 30000.0);
        map.put(new Employee("Raju", 40, "Tester"), 40000.0);
        map.put(new Employee("Rakesh", 45, "Designer"), 50000.0);

        for(Map.Entry<Employee, Double> entry : map.entrySet())
        {
            System.out.println(entry.getKey().name +"   "+ entry.getKey().designation+"   " + entry.getValue());
        }
    }

}
