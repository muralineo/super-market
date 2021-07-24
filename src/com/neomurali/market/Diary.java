package com.neomurali.market;

public class Diary extends Grocery{
    private Fat fat;

    public Diary(String name, double price, double discount, Fat fat) {
        super(name, price, discount);
        this.fat = fat;
    }

    @Override
    public String toString() {
        return "Diary{" +
                "fat=" + fat +
                "} " + super.toString();
    }
}
