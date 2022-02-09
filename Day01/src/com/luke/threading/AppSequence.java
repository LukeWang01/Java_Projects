package com.luke.threading;

public class AppSequence {

    public static void main(String[] args) {

        Sequence sequence = new Sequence();

        Worker work1 = new Worker(sequence);
        work1.start();

        Worker work2 = new Worker(sequence);
        work2.start();

    }
}

class Worker extends Thread{

    Sequence sequence = null;

    public Worker(Sequence sequence){
        this.sequence = sequence;
    }

    public void run(){
        for (int i = 0; i < 50; i++) {
            System.out.println(Thread.currentThread().getName() + " - " + sequence.getNext());

        }

    }

}