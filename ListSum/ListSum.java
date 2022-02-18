//Question 1

package com.company;
import java.util.*;

public class ListSum {
    public static void main(String[] args) {
        List<Float> list = new ArrayList<>();
        list.add(34.5f);
        list.add(988.1f);
        list.add(55.879f);
        list.add(23.986f);
        list.add(10.0f);

        Iterator<Float> it = list.iterator();

        double sum =0;
        while(it.hasNext()){
            sum+= it.next();
        }
        System.out.println("The sum of Floating Point numbers is : " + sum);

    }
}
