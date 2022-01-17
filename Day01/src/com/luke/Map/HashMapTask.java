package com.luke.Map;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class HashMapTask {

    public static void main(String[] args) {
        // not ordered
        HashMap<String, String> dict = new HashMap<String,String >();
        dict.put("Luke", "Cool");
        dict.put("A", "ALIBAB");
        dict.put("B", "BLK");
        dict.put("LK", "Look");
        dict.put("LK", "Look");

        for (String key : dict.keySet()) {
            //System.out.println(key);
            System.out.println(dict.get(key));
        }
        System.out.println("------split line--------");
        for (Map.Entry<String, String> entry : dict.entrySet()) {
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }

        System.out.println("------split line--------");
        TreeMap<String, String> tree = new TreeMap<>();
        tree.put("Luke", "Cool");
        tree.put("A", "ALIBAB");
        tree.put("B", "BLK");
        tree.put("LK", "Look");
        tree.put("A", "Look"); // it will override the same key value

        // sorted by key
        for (Map.Entry<String,String> entry : tree.entrySet()) {
            System.out.println(entry.getValue());
        }
    }
}
