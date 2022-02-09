package com.luke.threading;

public class AppThreading {
    public  static void main(String args[]){

        System.out.println("Thread 1 started");
        Task taskRunner = new Task("A");
        taskRunner.start();  // thread can be restarted again after finish

        System.out.println("Hello WOW...");

        System.out.println("Thread 2 started");
        Task taskRunner2 = new Task("B");
        taskRunner2.start();

    }
}


class Task extends Thread{

    String name;

    public Task(String name) {
        this.name = name;
    }

//    @Override
//    public String getName() {
//        return name;
//    }
//
//    @Override
//    public void setName(String name) {
//        this.name = name;
//    }

    public void run(){
        Thread.currentThread().setName(this.name);
        for (int i = 0; i < 100; i++) {
            System.out.println("number:" + i + " - " + Thread.currentThread().getName());
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }
}