package com.neomurali.market;

public class Beverage extends Grocery {
    SugarLevel sugarLevel;

    public Beverage(String name, double price, double discount, SugarLevel sugarLevel) {
        super(name, price,discount);
        this.sugarLevel = sugarLevel;
    }


    @Override
    public String toString() {
        return "Beverage{" +
                "sugarLevel=" + sugarLevel +
                "} " + super.toString();
    }
}
