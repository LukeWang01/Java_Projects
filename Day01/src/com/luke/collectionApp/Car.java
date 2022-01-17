package com.luke.collectionApp;

import java.util.Objects;

public class Car implements Comparable<Car>{

    private String name;
    private int price;
    private String owner;


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return price == car.price && name.equals(car.name) && owner.equals(car.owner);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, price, owner);
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", owner='" + owner + '\'' +
                '}';
    }

    public Car(String name, int price, String owner) {
        this.name = name;
        this.price = price;
        this.owner = owner;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public static void run(){
        System.out.println("car is running");
    }

    // implement the compare method and declare the field to be compared
    @Override
    public int compareTo(Car o) {
        if (this.price < o.price) {
            return -1;
        } else if (this.price > o.price){
            return 1;
        }
        return 0;
    }
}
