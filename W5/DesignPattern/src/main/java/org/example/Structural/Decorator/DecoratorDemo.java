package org.example.Structural.Decorator;

public class DecoratorDemo {

    public static void main(String[] args) {
        Bag bagWithLaptopSlot = new WithLaptopSlot(new BasicBag());
        bagWithLaptopSlot.assemble();
        System.out.println("----*----");

        Bag bagWithLaptopAndBottleSlot = new WithLaptopSlot(new WithWaterBottle(new BasicBag()));
        bagWithLaptopAndBottleSlot.assemble();
    }
}
