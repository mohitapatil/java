package org.example.Creational.Factory;

public class CurrencyFactory {

    public static CurrencyImpl createCurrency (String country) {
        if (country. equalsIgnoreCase ("India")){
            return new Rupee();
        }else if(country. equalsIgnoreCase ("GreatBritan")){
            return new Pound();
        }else if(country. equalsIgnoreCase ("US")){
            return new USDDollar();
        }
        throw new IllegalArgumentException("No such currency");
    }

}
