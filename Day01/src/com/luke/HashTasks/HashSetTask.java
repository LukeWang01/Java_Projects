package com.luke.HashTasks;

import java.util.*;

import com.luke.collectionApp.Car;


public class HashSetTask {
    public static void main(String[] args) {
        // no duplicate values allowed, like the set or tuple in Python
        // order is not managed with the hashset
        HashSet<Integer> intSet = new HashSet<>();
        intSet.add(12);
        intSet.add(23);
        intSet.add(41);
        intSet.add(54);

        for (Integer i : intSet) {
            System.out.println(i);
        }

        HashSet<String> strSet = new HashSet<>();
        strSet.add("Luke");
        strSet.add("HAHA");
        strSet.add("WOW");
        for (String i : strSet) {
            System.out.println(i);
        }

        // order to be maintained, LinkedHashSet
        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add("Lu");
        linkedHashSet.add("ke");
        for (String i : linkedHashSet) {
            System.out.println(i);
        }

        HashSet<Car> cars = new HashSet<>();
        Car car1 = new Car("Mazda",100,"Luke");
        Car car2 = new Car("BMW", 230,"Luke");
        Car car3 = new Car("BMW", 100,"Luke");
        Car car4 = new Car("DABEN", 500,"Luke");

        cars.add(car1);
        cars.add(car2);
        cars.add(car3);

        // after override the equals and hashCode method, hashCode will identify the duplicate values
        System.out.println(cars);
        System.out.println(car2.equals(car3));
        System.out.println(car1.hashCode());
        System.out.println(car2.hashCode());
        System.out.println(car3.hashCode());

        for (Car i : cars) {
            System.out.println(i);
        }

        // addAll, add one list to another
        // removeAll, remove the value in b from a; retainAll, verse vise
        // clear, clear list
        // contains(), boolean
        // isEmpty()

        // convert the hashSet to List
        //List<Integer> intList = new ArrayList<>(intSet);
        ArrayList<Integer> intList = new ArrayList<>(intSet);
        Collections.sort(intList);
        System.out.println(intList); // sort, type to be list

        ArrayList<String> stringArrayList = new ArrayList<>(strSet);
        Collections.sort(stringArrayList);
        System.out.println(stringArrayList);

        ArrayList<Car> mycars = new ArrayList<>(cars);
        Collections.sort(mycars);
        System.out.println(mycars);


    }
}
