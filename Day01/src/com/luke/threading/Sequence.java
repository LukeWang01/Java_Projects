package com.luke.threading;

public class Sequence {

    private int val = 0;

    public int getNext(){
        synchronized(this) {
            // lock, do all or do nothing
            val++;
            return val;
        }
    }

    public synchronized int getNext1(){
        // define the synchronized method
        // lock, do all or do nothing
        val++;
        return val;

    }

}
