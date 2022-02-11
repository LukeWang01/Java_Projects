package com.luke.inventory;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;
import java.util.concurrent.CopyOnWriteArrayList;

public class InventoryManager {

    //List<Product> soldProductlist = new ArrayList<>();
    List<Product> soldProductlist = new CopyOnWriteArrayList<>();  // concurrent collection
    List<Product> purchaseProductlist = new ArrayList<>();
    
    //Vector vector = new Vector(); introduced in Java 1

    public void populateSoldProducts(){
        for (int i = 0; i < 50; i++) {
            Product product = new Product(i, "test ID: " + i);
            soldProductlist.add(product);
            System.out.println("Added: " + product.name);
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }
    public void displaySoldProducts(){
        for(Product product : soldProductlist){
            System.out.println("Sold: " + product.name);

            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }


    }

}
