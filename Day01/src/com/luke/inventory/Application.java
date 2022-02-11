package com.luke.inventory;

public class Application {

    public static void main(String[] args) throws InterruptedException {


        InventoryManager manager = new InventoryManager();

        Thread inventoryTask = new Thread(new Runnable() {
            @Override
            public void run() {
                manager.populateSoldProducts();
            }
        });

        Thread displayTask = new Thread(new Runnable() {
            @Override
            public void run() {
                manager.displaySoldProducts();
            }
        });
        inventoryTask.start();
        Thread.sleep(200);
        //inventoryTask.join();  // control the thread
        displayTask.start();

    }

}
