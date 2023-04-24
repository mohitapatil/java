package org.example.Behavioral.Template;

public class TemplateDemo {

    public static void main(String[] args) {
        CarTemplate myClassic = new ClassicCar("Corvette");
        CarTemplate mySports = new SportesCar("Porche Tycan");
        myClassic.manufactureCar();
        mySports.manufactureCar();
    }
}
