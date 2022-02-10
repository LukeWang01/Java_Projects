package com.luke.inventory;

public class Application {
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
            manager.populateSoldProducts();
        }
    });

}
