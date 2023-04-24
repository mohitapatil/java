package org.example.Structural.Decorator;

public class WithLaptopSlot extends BagDecorator{

    public WithLaptopSlot(Bag bag) {
        super(bag);
    }

    @Override
    public void assemble(){
        super.assemble();
        System.out.println("Adding laptop slot");
    }
}
