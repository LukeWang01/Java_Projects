package com.luke.inventory;

import java.util.ArrayList;
import java.util.List;

public class InventoryManager {

    List<Product> soldProductlist = new ArrayList<>();
    List<Product> purchaseProductlist = new ArrayList<>();

    public void populateSoldProducts(){
        for (int i = 0; i < 50; i++) {
            Product product = new Product(i, "test ID: " + i);
            soldProductlist.add(product);
            System.out.println("Added: " + product);
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }
    public void displaySoldProducts(){
        for(Product product : soldProductlist){
            System.out.println("Sold: " + product);

            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }


    }

}
