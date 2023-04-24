package org.example.Creational.Factory;

public class Factory {

    public static void main(String args[]) {
        String country = args[0];
        CurrencyImpl rupee = CurrencyFactory.createCurrency(country);
        System.out.println(rupee.getAcronym());
    }
}
