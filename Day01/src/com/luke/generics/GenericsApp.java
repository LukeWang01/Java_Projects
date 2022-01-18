package com.luke.generics;

import java.util.ArrayList;

public class GenericsApp {
    public static void main(String[] args) {

        Object object1 = new Object();
        String str = "WOW"; // can be assigned
        object1 = str;
        System.out.println(object1);

        ArrayList<Object> obj = new ArrayList<>();
        ArrayList<String> str1 = new ArrayList<>();
        // str1 = obj; can not do that, not the same type

        // can do wild card
        ArrayList<?> obj2 = new ArrayList<>();
        ArrayList<String> str2 = new ArrayList<>();
        obj2 = str2;
        // str2 = obj2; wrong way

        // upper bound
        ArrayList<? extends Object> obj3 = new ArrayList<>();
        ArrayList<String> str3 = new ArrayList<>();
        obj3 = str3;


        // lower bound
        ArrayList<? super String> str4 = new ArrayList<>();

    }
}
