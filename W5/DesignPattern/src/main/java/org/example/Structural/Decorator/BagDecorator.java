package org.example.Structural.Decorator;

public class BagDecorator implements Bag{
    private Bag bagDecorator;

    public BagDecorator(Bag bag){
        this.bagDecorator= bag;
    }

    @Override
    public void assemble() {
        this.bagDecorator.assemble();
    }
}
