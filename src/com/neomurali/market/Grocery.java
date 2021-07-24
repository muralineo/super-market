package com.neomurali.market;

public class Grocery {

    private String name;
    private double price;
    private double discount;

    public Grocery(String name, double price, double discount){
        this.name = name;
        this.price = price;
        this.discount = discount;
    }

    public Grocery(String name, double price){
        this.name = name;
        this.price = price;

    }

    @Override
    public String toString() {
        return "Grocery{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", discount=" + discount +
                '}';
    }

    public static void main(String[] args) {
        Grocery product1 = new Grocery("Bread", 50, 0);
        Grocery product2 = new Grocery("Biscuit", 10, 0);
        Beverage product3 = new Beverage("Coke", 20, 0, SugarLevel.ADDED_SUGAR);
        Diary product4 = new Diary("Milk", 25, 1, Fat.FULL);
        Grocery product5 = new Grocery("Soap", 50);

        System.out.println(product1.toString());
        System.out.println(product3.toString());
    }
}
