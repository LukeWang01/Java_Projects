package com.luke.collectionApp;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class CollectionTask {

    public static void main (String [] args) {

        ArrayList wordsList = new ArrayList();
        wordsList.add("hello");
        wordsList.add("there");
        wordsList.add(10);
        //wordsList.remove();
        String firstVal = (String) wordsList.get(0); // need to cast the data type
        System.out.println(firstVal);
        int thirdVal = (int)wordsList.get(2);
        System.out.println(thirdVal);
        System.out.println("-------spilt line---------");


        // faster for retrieval, but slower for manipulation
        // array size default is 10, with a step of 10
        ArrayList<String> wordStringOnly = new ArrayList<>(); //no need to add the String type after new key word
        wordStringOnly.add("somestring");
        // wordStringOnly.add(10); can't add 10, force the data type to be String
        System.out.println(wordStringOnly); // print object
        System.out.println(wordStringOnly.get(0));  // print object item, idex = 0
        System.out.println("-------spilt line---------");


        // linkedList is faster for manipulation, but slower for retrieval
        LinkedList<Integer> numbers = new LinkedList<>();
        numbers.add(100);
        numbers.add(200);
        numbers.add(45);
        numbers.add(1000);
        numbers.remove(); // remove the 1st one by default, equal .removeFirst()
        numbers.remove(2);


        for (int i : numbers){
            System.out.println(i);
        }

        ArrayList<String> animals = new ArrayList<>();  // <type> should be a class or interface
        animals.add("Lion");
        animals.add("cat");
        animals.add("Dog");
        animals.add("Bird");

        for (int i = 0; i < animals.size(); i++) {
            System.out.println(animals.get(i));
        }
        System.out.println("-------spilt line---------");
        for (String value : animals){
            System.out.println(value);
        }

        LinkedList<Car> myCars = new LinkedList<>();
        //ArrayList and LinkedList work in the same way, but have some pros and cons
        //ArrayList<Car> myCars = new ArrayList<>();
        Car mycar1 = new Car("Mazda",10000,"Luke");
        myCars.add(mycar1);
        myCars.add(new Car("BWM", 10000,"Luke"));
        System.out.println("--------------");

        for (Car cars : myCars) {
            System.out.println(cars); //if not toString added, it should be Car@7878938
            // System.out.println(cars.toString());
            // System.out.println("--------------");
            System.out.println(cars.getName());
            //System.out.println(cars.getPrice());
        }

        System.out.println("-------split--------");

        printAllList(animals);
        printAllList(myCars);

    }




    // List type with the method exits in both LinkedList and ArrayList
    //
    public static void printAllList(List someList){
//        for (int i = 0; i < someList.size(); i++) {
//            System.out.println(someList.get(i));
//        }
        // can be replaced by below:

        for (Object obj : someList){
            System.out.println(obj);
        }
    }

}
