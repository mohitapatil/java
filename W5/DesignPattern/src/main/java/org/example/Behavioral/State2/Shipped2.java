package org.example.Behavioral.State2;

public class Shipped2 implements State2{
    @Override
    public void nextstate(Context ctx) {
        System.out.println("Shippment done");
        ctx.setState2(new Delivered2());
    }
}
