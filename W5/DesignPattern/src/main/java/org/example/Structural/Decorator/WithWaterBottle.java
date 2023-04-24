package org.example.Structural.Decorator;

public class WithWaterBottle extends BagDecorator{

    public WithWaterBottle(Bag bag) {
        super(bag);
    }

    @Override
    public void assemble(){
        super.assemble();
        System.out.println("Adding water bottle compartment");
    }
}
